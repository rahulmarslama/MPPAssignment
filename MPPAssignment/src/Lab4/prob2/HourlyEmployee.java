package Lab4.prob2;

public class HourlyEmployee extends Employee
{
    private double hourlyWage;
    private double hoursPerWeek;

    public HourlyEmployee(int empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }


    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month,int year){
        return hourlyWage*hoursPerWeek;
    }
}
