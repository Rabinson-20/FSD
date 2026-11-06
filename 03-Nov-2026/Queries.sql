use FACEPrep;

show tables;
SELECT * FROM emp;

ALTER TABLE emp CHANGE age course VARCHAR(50);

INSERT INTO emp VALUES(1, 'Arun', 'MBA'), (5, 'Priya', 'MCA'),(26, 'Riya', 'M.com');

ALTER TABLE emp ADD salary INT;

ALTER TABLE emp MODIFY name VARCHAR(50);

ALTER TABLE emp RENAME COLUMN course TO department;

ALTER TABLE emp DROP COLUMN salary;

DROP TABLE emp;

CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);

INSERT INTO emp VALUES
(1, 'Arun', 'MBA'),
(5, 'Priya', 'MCA'),
(26, 'Riya', 'M.com');

UPDATE emp SET course = 'MCA' WHERE id = 1;

UPDATE emp SET name = 'Priyanka' WHERE id = 5;

DELETE FROM emp WHERE id = 26;

SELECT COUNT(*) FROM emp;

SELECT MAX(id) FROM emp;

SELECT MIN(id) FROM emp;

ALTER TABLE emp ADD salary INT;

SELECT SUM(salary) FROM emp;

SELECT AVG(salary) FROM emp;

SELECT * FROM emp WHERE id BETWEEN 1 AND 10;

SELECT * FROM emp WHERE name LIKE 'R%';

SELECT * FROM emp WHERE name LIKE 'R%';

SELECT * FROM emp WHERE name LIKE '%i%';