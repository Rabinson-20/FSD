use FACEPrep;

SELECT id, name, course,
CASE
    WHEN course = 'MBA' THEN 'Management'
    WHEN course = 'MCA' THEN 'Computer Application'
    WHEN course = 'M.com' THEN 'Commerce'
    ELSE 'Other'
END AS COURSE_TYPE
FROM emp;