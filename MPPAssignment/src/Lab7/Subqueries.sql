-- 1. Find the name of the employee who has the highest salary
    SELECT name
    FROM employee
    WHERE salary = (SELECT max(salary) from employee);

-- 2. List the names of employees who work on a project that has an estimated_days of 180

    SELECT employee.name
    FROM employee
    INNER JOIN employee_project ON employee.emp_id = employee_project.emp_id
    INNER JOIN project ON employee_project.project_id = project.project_id
    WHERE project.estimated_days = 180;

-- 3. Find the project_id of all projects that have an estimated duration greater than the
-- average estimated duration of all projects.
    SELECT project_id
    FROM project
    WHERE estimated_days >
          (SELECT avg(estimated_days) FROM project)