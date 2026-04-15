package Lab11.part2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Address add1 = new Address("500 E Broadway Ave", "Fairfield", "IA", 52556);
        Address add2 = new Address("103 W Adams Ave", "Downtown", "IA", 52556);

        Section cs545_1 = new Section(900, "CS545_1");
        Section cs545_2 = new Section(901, "CS545_2");
        Section cs401 = new Section(902, "CS401");
        Section cs221 = new Section(903, "CS221");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(111, "Yasmeen", new ArrayList<>(Arrays.asList(3.9, 4.0, 3.7)), add1,
                        new ArrayList<>(Arrays.asList(cs545_1, cs401))),
                new Student(112, "Mira", new ArrayList<>(Arrays.asList(4.0, 4.0, 3.9)), add1,
                        new ArrayList<>(Arrays.asList(cs545_2, cs401, cs221))),
                new Student(113, "Zaina", new ArrayList<>(Arrays.asList(3.6, 3.3, 3.7)), add1,
                        new ArrayList<>(Arrays.asList(cs221, cs401))),
                new Student(114, "Khaled", new ArrayList<>(Arrays.asList(3.0, 2.8, 3.1)), add2)
        ));

        // Find all the students that are taking a given course
        Optional<Student> students1 = students.stream()
                .filter(stu->stu.sections!=null).findFirst();
        System.out.println(students1);

        // Get the address of any student that is taking a given course (e.g., "CS401")
        Optional<Address> address1 = students.stream()

                .filter(stu-> stu.sections.stream()
                        .anyMatch(sec->sec.getCourseCode().equals("CS401"))
                )
                .map(x->x.address)
                .findFirst();
        address1.ifPresentOrElse(System.out::println,()-> System.out.println("No student found for CS401"));

        // Calculate the GPA for a given student
        String studentName = "Yasmeen";
        double gpa = students.stream()
                .filter(stu->stu.getName().equals(studentName))
                .findFirst()
                .map(x->x.grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0))
                .orElse(0.0)
                ;

        System.out.printf("Average GPA is %.2f \n",gpa);


        // Find the student with the highest GPA
        Optional<Student> topStudent = students.stream()
                .filter(stu -> stu.grades != null && !stu.grades.isEmpty())
                .max(Comparator.comparingDouble(stu ->
                        stu.grades.stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0)
                ));
        topStudent.ifPresentOrElse(System.out::println,()-> System.out.println("No student found"));

        // Get a list of all unique courses taken by students
        var uniqueCourses = students.stream()
                .filter(x->x.sections!=null)
                .flatMap(x->x.sections.stream())
                .map(x->x.getCourseCode())
                .distinct()
                .toList();

        System.out.println(uniqueCourses);

        // Find all students who live in a given city (e.g., "Fairfield") sorted in alphabetical order
        String cityName = "Fairfield";
        var students2 = students.stream()
                .filter(x->x.address.city.equals(cityName))
                .sorted(Comparator.comparing(Student::getName))
                .toList();

        System.out.println(students2);

        // Count the number of students enrolled in a specific course (e.g., "CS401")
        String courseCode = "CS401";
        long count = students.stream()
                .filter(x->x.sections!=null)
                .filter(x-> x.sections.stream().anyMatch(y -> y.getCourseCode().equals(courseCode)))
                .count();
        System.out.println(count);

        // Get a list of students in a specific section
        int sectionId = 903;

        var student3 = students.stream()
                .filter(x->x.sections!=null)
                .filter(x->x.sections.stream().anyMatch(y->y.getId()==sectionId))
                .toList();

        System.out.println(student3);

        //  Get the names of students who have enrolled in more than a given number of courses (e.g., more than 2 courses)
        long coursesCount = 2;
        var names = students.stream()
                .filter(x->x.sections!=null)
                .filter(x->x.sections.stream().count()>=coursesCount)
                .map(x->x.getName()).toList();
        System.out.println(names);

        // Get a list of unique course names taken by students who live in a given city (e.g., "Fairfield")
        var courseNames = students.stream()
                .filter(x->x.address.city.equals(cityName))
                .flatMap(x->x.sections.stream())
                .map(x->x.getCourseCode())
                .distinct()
                .toList();

        System.out.println(courseNames);


        // Get a list of distinct addresses of students who are taking a specific course (e.g., "CS401")
        var addresses = students.stream()
                .filter(x->x.sections!=null)
                .filter(x->x.sections.stream().anyMatch(y->y.getCourseCode().equals(courseCode)))
                .map(x->x.address)
                .distinct()
                .toList();
        System.out.println(addresses);

        // Get a mapping of students' names to the list of courses they are taking
        Map<String,List<String>>  studentCourses = students.stream()
                .filter(s->s.sections!=null)
                .collect(Collectors.toMap(Student::getName,
                        s->s.sections.stream().map(Section::getCourseCode).distinct().toList()));

        studentCourses.forEach((name,course)-> System.out.println(name+"->"+course));

    }
}
