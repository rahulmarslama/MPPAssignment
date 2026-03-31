package Lab2.prob2a;

public class Student
{
    public GradeReport gradeReport;

    public Student() {
        gradeReport = new GradeReport(this);
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }
}
