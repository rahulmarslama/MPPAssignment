package Lab8;

public class Employee
{
    private int emp_id;
    private int address_id;
    private int dept_id;
    private int salary;
    private String name;


    public Employee(int emp_id, int address_id, int dept_id, int salary, String name) {
        this.emp_id = emp_id;
        this.address_id = address_id;
        this.dept_id = dept_id;
        this.salary = salary;
        this.name = name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", address_id=" + address_id +
                ", dept_id=" + dept_id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
