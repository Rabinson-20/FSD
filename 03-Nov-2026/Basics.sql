show databases;

create database FACEPrep;
use FACEPrep;
create table students(id int primary key, name varchar(50), dept varchar(20));
SELECT * FROM students;
show tables;
SELECT * FROM emp;
Select * from student;

alter table emp add dept varchar(20);

ALTER table emp drop age;

ALTER TABLE emp RENAME COLUMN dept to Department;

ALTER TABLE emp modify name varchar(20) NOT NULL;

ALTER TABLE emp RENAME TO Employee;

DROP TABLE Employee; 

TRUNCATE TABLE student; 

UPDATE student SET name = 'Prathibaa', age= '19' WHERE id = 1;
UPDATE student SET name='Balambika' , age='23' WHERE id= 2 ;

UPDATE student SET name='Kalai';