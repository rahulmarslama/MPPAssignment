package Lab4.prob2;

public class SalariedEmployee extends Employee
{
    private double salary;

    public SalariedEmployee(int empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month,int year){
        return salary;
    }
}
