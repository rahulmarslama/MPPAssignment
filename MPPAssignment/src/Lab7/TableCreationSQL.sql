CREATE TABLE Address
(
    address_id INT PRIMARY KEY,
    city VARCHAR(50) NOT NULL,
    state CHAR(2) NOT NULL,
    zipcode VARCHAR(10)
);

CREATE TABLE Department
(
    dept_id INT PRIMARY KEY,
    name VARCHAR(15)
);

CREATE TABLE Employee
(
    emp_id INT PRIMARY KEY,
    address_id INT REFERENCES Address(address_id),
    dept_id INT REFERENCES Department(dept_id),
    salary INT,
    name VARCHAR(20)
);


CREATE TABLE Project
(
    project_id INT PRIMARY KEY ,
    project_name VARCHAR(20),
    estimated_days INT,
    location VARCHAR(10)
);

CREATE TABLE Employee_Project
(
    emp_id INT REFERENCES Employee(emp_id),
    project_id INT REFERENCES Project(project_id),
    PRIMARY KEY(emp_id,project_id)
);

