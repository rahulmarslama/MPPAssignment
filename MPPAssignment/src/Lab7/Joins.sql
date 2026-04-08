-- 1. List the employee name and the city where they live. (Join Employee and Address).
    SELECT employee.name,address.city
    FROM employee
    LEFT JOIN address ON employee.address_id = address.address_id;

-- 2. List all departments and the names of the employees who belong to them. Include
-- departments that may not currently have any employees. (Join Department and
-- Employee). Note: Based on the sample data, all departments have employees, but this
-- query structure is key for future scenarios.

    SELECT department.name,employee.name
    FROM department
    LEFT JOIN employee ON department.dept_id = employee.dept_id

-- 3. Find the employee name and the name of the projects they are working on. (Join
-- Employee, Employee_Project, and Project).
    SELECT e.name,p.project_name
    FROM employee e
    LEFT JOIN employee_project ep ON e.emp_id=ep.emp_id
    JOIN project p ON p.project_id = ep.project_id