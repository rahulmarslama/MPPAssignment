CREATE VIEW EmployeeDetails AS
    SELECT e.emp_id,e.name AS employee_name, e.salary,
           d.name AS dept_name, p.project_name
        FROM employee e
        INNER JOIN department d ON d.dept_id = e.dept_id
        INNER JOIN employee_project ep ON ep.emp_id = e.emp_id
        INNER JOIN project p ON p.project_id = ep.project_id;


SELECT * FROM EmployeeDetails;


CREATE INDEX idx_employee_name ON employee(name);