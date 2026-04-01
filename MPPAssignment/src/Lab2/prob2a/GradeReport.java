package Lab2.prob2a;

public class GradeReport
{
    public Student student;

    public double grade;
    GradeReport(double grade,Student st)
    {
        this.grade = grade;
        student = st;
    }

    public double getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }
}
