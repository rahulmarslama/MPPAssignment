package Lab2.prob2a;

public class Student
{
    public GradeReport gradeReport;
    public String studentName;

    public Student(String name,double grade) {
        studentName = name;
        gradeReport = new GradeReport(grade,this);
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
