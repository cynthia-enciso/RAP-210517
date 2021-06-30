/* -------------------------- select --------------------------------*/
select * from students;
-- where clause: conditional expression used with select, update, and delete
-- you can use comparison operators (=, >, <, >=, <=, !=) with where
-- or logical operators (AND, OR, IN, BETWEEN, LIKE, IS NULL, NOT) with where
select * from students where gpa < 2; -- doesn't take null into account
select (id, name) from students where gpa = 3.5;
select distinct gpa from students; -- does include null

-- LIKE: looking for a value that matches a pattern
----- %: matches zero or more characters
select * from students where name not like 'C%';

----- ILIKE: same as like but ignores casing
select * from students where name like 'c%';
select * from students where name ilike 'c%';

select * from students where name like '%a%';

-----_: matches a single character
select * from students where name like '_yle';

-- BETWEEN: looking for a range of values
select * from students where gpa between 1 and 3;
select * from students where gpa not between 1 and 3;

-- IS NULL: returns records that have null in the specified column
select * from students where gpa is null;
select * from students where gpa is not null;

-- IN: returns records where column value is in listed values
select * from students where gpa in(3.5, 4);

-- LIMIT/OFFSET
select * from students limit 5;
select * from students limit 5 offset 3;

-- ORDER BY
select * from students order by gpa asc;
select * from students order by gpa desc;
select * from students order by gpa desc nulls first;
select * from students order by gpa desc nulls last;
select * from students where name like 'C%' order by gpa desc;
-- get 5 most recent graduates
select * from students order by graduation desc nulls last limit 5;

-- subquery
select * from students where gpa > (select avg(gpa) from students);

/* -------------------------- scalar functions --------------------------------*/
-- scalar function: for every input, returns a value
-- string functions:
----- char_length/character_length
select name, char_length(name) from students;

----- upper
select name, upper(name) from students;
----- lower
select name, lower(name) from students;
----- initcap: capitalizes the first letter of every word
select initcap('the end') from students limit 1;
---- concat
select concat(name, '''s gpa: ', gpa) from students;

-- math functions:
----- abs
select abs(gpa) from students;
----- floor
select gpa, floor(gpa) from students;
----- ceil
select gpa, ceil(gpa) from students;

-- coalesce: returns first argument that is not null
select gpa from students;
select coalesce(gpa, 0) from students;

/* -------------------------- aggregate functions --------------------------------*/
-- aggregate function: takes lots of input and return one value
-- aggregate functions do not evaluate null values
-- count
select count(*) from students;
select count(distinct gpa) from students; --unique gpas, not null
select count(graduation) from students; -- no nulls
select count(name) from students where name like 'K%';

-- max
select max(graduation) from students; -- dates
select max(gpa) from students; -- decimal
select max(name) from students; -- text
-- min
select min(graduation) from students;
select min(gpa) from students;
select min(name) from students;
-- avg
select avg(gpa) from students; -- works only with numbers
-- sum
select sum(gpa) from students;

/* -------------------------- grouping --------------------------------*/
-- groups result of select statement by one or more columns
-- expressions not in an aggregate function must be included in group by clause
select count(gpa) from students; -- counting not-null gpas
-- groups gpa values AND THEN performs aggregate function on those groups (counts by gpa)
select count(gpa), gpa from students group by gpa;
-- additionally, filter results of aggregate function with having clause.
----- only returning rows where count is > 1
select count(gpa), gpa from students group by gpa having count(gpa) > 1;
-- with where, you filter out rows AND THEN group and perform aggregate function
select count(gpa), gpa from students where gpa > 1 group by gpa; 
-- you can have filtering before and after group by (with where and having)
select count(gpa), gpa from students where gpa > 1 group by gpa having count(gpa) > 1; 
