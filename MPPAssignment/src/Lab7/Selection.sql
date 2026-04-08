-- 1. List the name and salary of all employees.
    SELECT name,salary
    FROM employee;

-- 2. Find the names of all projects located in Florida (FL).
    SELECT project_name
    FROM project
    WHERE location = 'FL';

-- 3. Retrieve the emp_id and project_id for employees working on Project 1.
    SELECT emp_id,project_id
    FROM employee_project
    WHERE project_id = 1;

-- 4. Find all unique (distinct) states where employee addresses are located.
    SELECT DISTINCT state
    FROM address;

-- 5. List the names and salaries of all employees who earn a salary less than $150,000.
    SELECT name,salary
    FROM employee
    WHERE salary<150000;

-- 6. List the project names and their estimated days, ordered from the longest duration to the shortest.
    SELECT project_name,estimated_days
    FROM project
    ORDER BY estimated_days DESC;

-- 7. Find the emp_ids of employees who are assigned to a project, listing each emp_id only
-- once.
    SELECT DISTINCT emp_id
    FROM employee_project
