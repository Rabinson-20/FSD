CREATE DATABASE CollegeDB;

USE CollegeDB;

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

INSERT INTO Department VALUES
(101, 'Computer Science'),
(102, 'Electronics'),
(103, 'Mechanical');

INSERT INTO Student VALUES
(1, 'Arun', 101),
(2, 'Priya', 102),
(3, 'Karthik', 101),
(4, 'Divya', 103);

SELECT
    Student.student_id,
    Student.student_name,
    Department.dept_name
FROM Student
INNER JOIN Department
ON Student.dept_id = Department.dept_id;