use nov5;
select department ,count(first_name) as total from Worker group by department order by total asc;

select department ,count(first_name) from Worker group by department having count(first_name) >2 order by count(first_name) asc;