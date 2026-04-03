package Lab4.prob2;

public abstract class Employee
{
    private int empId;

    public Employee(int empId) {
        this.empId = empId;
    }


    public int getEmpId() {
        return empId;
    }

    public void print()
    {
        System.out.println(toString());
    }

    public Paycheck calcCompensation(int month,int year)
    {
        double grossPay = calcGrossPay(month,year);
        Paycheck paycheck = new Paycheck(grossPay);
        return paycheck;
    }

    public abstract double calcGrossPay(int month,int year);

    @Override
    public String toString()
    {
        return String.format("""
                Employee Id: %d
                Payment: $%.2f
                """,
                this.getEmpId()
        );
    }


}
