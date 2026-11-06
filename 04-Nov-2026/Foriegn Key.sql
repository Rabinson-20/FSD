use FACEPrep;
Drop table course;
CREATE TABLE course (
    course_name VARCHAR(50) PRIMARY KEY
);

INSERT INTO course VALUES
('MBA'),
('MCA'),
('M.com');

ALTER TABLE emp ADD CONSTRAINT fk_course FOREIGN KEY (course) REFERENCES course(course_name);

SELECT * FROM emp;

SELECT * FROM course;