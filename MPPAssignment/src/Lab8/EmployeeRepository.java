package Lab8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.*;

public class EmployeeRepository
{
    static void main()
    {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee newEmployee = new Employee
                (116,4,3,10000,"Rahul Mars Lama");

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "Mars@123abcd";
        try (Connection conn = getConnection(url, user, password))
        {
            create(conn,newEmployee);
            List<Employee> allEmployee = findAll(conn);
            allEmployee.forEach(System.out::println);

            Employee emp = findById(conn, newEmployee.getEmp_id());
            System.out.println(emp);

            emp.setName("Rahul Lama");
            update(conn,emp);
            Employee updatedEmp = findById(conn, newEmployee.getEmp_id());
            System.out.println(updatedEmp);

            delete(conn,emp.getEmp_id());
            Employee deletedEmployee = findById(conn, newEmployee.getEmp_id());
            System.out.println(deletedEmployee); //should be null

        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }



    }

    public static void create(Connection conn,Employee employee) throws SQLException {
        String query = "INSERT INTO Employee (emp_id, name, salary, address_id, dept_id) VALUES (?,?,?,?,?)";


        PreparedStatement ps = conn.prepareStatement(query);

        ps.setInt(1,employee.getEmp_id());
        ps.setString(2,employee.getName());
        ps.setInt(3,employee.getSalary());
        ps.setInt(4,employee.getAddress_id());
        ps.setInt(5,employee.getDept_id());

        int resultRows  = ps.executeUpdate();
        if(resultRows != 1)
        {
            throw new SQLException("Unable to create a new employee.");
        }
    }
    public static List<Employee> findAll(Connection conn) throws SQLException
    {
        String query = "SELECT * FROM employee;";
        Statement statement = conn.createStatement();
        ResultSet resultSet  = statement.executeQuery(query);
        List<Employee> allEmployees = new ArrayList<>();
        while (resultSet.next()) {
            Employee emp = new Employee(
                    resultSet.getInt("emp_id"),
                    resultSet.getInt("address_id"),
                    resultSet.getInt("dept_id"),
                    resultSet.getInt("salary"),
                    resultSet.getString("name")
            );
            allEmployees.add(emp);
        }
        return allEmployees;

    }
    public static Employee findById(Connection conn,int empId) throws SQLException {
        String query = String.format("SELECT * FROM employee WHERE emp_id = %d;",empId);
        Statement statement = conn.createStatement();
        ResultSet resultSet  = statement.executeQuery(query);
        Employee emp = null;
        while (resultSet.next()) {
            emp = new Employee(
                    resultSet.getInt("emp_id"),
                    resultSet.getInt("address_id"),
                    resultSet.getInt("dept_id"),
                    resultSet.getInt("salary"),
                    resultSet.getString("name")
            );
        }
        return emp;
    }

    public static void update(Connection conn,Employee employee) throws SQLException
    {
        String sqlQuery = "UPDATE employee SET name =?, address_id = ?, dept_id = ?, salary = ? WHERE emp_id = ?";

        PreparedStatement ps = conn.prepareStatement(sqlQuery);
        ps.setString(1,employee.getName());
        ps.setInt(2,employee.getAddress_id());
        ps.setInt(3,employee.getDept_id());
        ps.setInt(4,employee.getSalary());
        ps.setInt(5,employee.getEmp_id());

        int rowsAffected  = ps.executeUpdate();
        if(rowsAffected != 1)
        {
            throw new SQLException("Unable to update the employee.");
        }
    }
    public static void delete(Connection conn,int empId) throws SQLException {

        String sqlQuery = "DELETE FROM employee WHERE emp_id = ?";

        PreparedStatement ps = conn.prepareStatement(sqlQuery);
        ps.setInt(1,empId);

        int rowsAffected  = ps.executeUpdate();
        if(rowsAffected != 1)
        {
            throw new SQLException("Unable to delete the employee.");
        }

    }
}
