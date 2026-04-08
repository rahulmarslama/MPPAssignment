-- 1. Calculate the average salary of all employees.
    SELECT avg(salary)
    FROM employee;

-- 2. Find the maximum estimated_days for any single project.
    SELECT max(estimated_days)
    FROM project;

-- 3. For each department, report the dept_id and the total salary expenditure.
    SELECT dept_id,sum(salary)
    FROM employee
    GROUP BY dept_id;

-- 4. Find the dept_id of departments that have an average employee salary greater than $150,000.
    SELECT dept_id
    FROM employee
    GROUP BY dept_id
    HAVING avg(salary) > 150000
