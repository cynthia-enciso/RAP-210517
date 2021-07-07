-- add data that doesn't have matches
insert into students values (default, 'Greg', 'Meyers', 4.0, 1),
							(default, 'Kesley', 'Biggs', 2.0, 1), 
							(default, 'Patrick', 'Crumwell', 1.5, 1),
							(default, 'Georgia', 'Linden', 4.0, 1);
						
insert into parents values (default, 'Guy', 'Orrickson'),
							(default, 'Fiona', 'Garrison'),
							(default, 'Yvonne', 'Newman'), 
							(default, 'Dorian', 'Mason');
						
-- what if you want data combined into a resultset from multiple tables?
	-- select statement with aliases
	-- JOIN operation
	-- UNION operation

-- alias: giving another name to a column or table

-- column alias
select (first_name, last_name) as full_name from students;

-- table alias
select (s.first_name, s.last_name) from students s;

-- using select with aliases
select s.first_name, s.last_name, p.first_name, p.last_name
from parents p, students s
where s.last_name = p.last_name;

-- JOINs: require that both tables have a column that tracks the same data
	-- they are usually foreign keys, but they don't have to be.
	-- on clause specifies condition or columns to join on
	-- returns results horizontally

-- INNER JOIN: returns MATCHES only
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
inner join parents p on s.last_name = p.last_name;
	-- this is an equijoin on columns with same names

-- LEFT JOIN: returns all records from first table and any matches from second table
	-- inner join doesn not matter as we only care about students and parents info
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
left join parents p on s.last_name = p.last_name;

-- RIGHT JOIN: returns all records from second table and any matches from first table
	-- inner join doesn not matter as we only care about students and parents info
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
right join parents p on s.last_name = p.last_name;

-- LEFT OUTER JOIN: returns all records from first table that have nulls from second table
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
left join parents p on s.last_name = p.last_name 
where p.last_name is null;

-- RIGHT OUTER JOIN: returns all records from second table that have nulls from first table
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
right join parents p on s.last_name = p.last_name 
where s.last_name is null;

-- FULL OUTER JOINS: 
-- all records returned from both tables
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
full join parents p on s.last_name = p.last_name;

-- all records returned from both tables that just have nulls from either table
select s.first_name, s.last_name, p.first_name, p.last_name
from students s
full join parents p on s.last_name = p.last_name 
where s.last_name is null or p.last_name is null;

-- cartesian product: product of both sets that results in all possible ordered pairs
drop table if exists table1;
create table if not exists table1(
	letter text
);

insert into table1 values ('A'), ('B'), ('C');

drop table if exists table2;
create table if not exists table2(
	number integer
);

insert into table2 values (1), (2), (3);

-- if you don't specify an on clause, it is a cross join
select * from table1 cross join table2;
select * from table1, table2;

-- set operations: when you want to use two different selects and combine results
	-- results are vertical
drop table if exists food1;
create table if not exists food1(
	name text
);

insert into food1 values('Banana'), ('Orange'), ('Eggs'), ('Waffles'), ('Butter');
drop table if exists food2;
create table if not exists food2(
	name text
);

insert into food2 values('Pizza'), ('Orange'), ('Cheese'), ('Waffles'), ('Spaghetti');
-- union: combination of two select statements
	-- both must return same number of columns with similar data types
select * from food1 union select * from food2;
select * from food1 union all select * from food2;

-- intersect: returns any rows that are available in both sets
select * from food1 intersect select * from food2;

-- except: returns any rows that are unique to left query
select * from food1 except select * from food2;

-- views: provide a "saved" query to work with that acts like another table
 	-- create
create or replace view full_join_view as 
select s.first_name as student_first, s.last_name as student_last, p.first_name as parent_first, p.last_name as parent_last
from students s
full join parents p on s.last_name = p.last_name;

select * from full_join_view;
	-- alter 
alter view full_join_view rename to full_view;
	-- drop
drop view if exists full_view;

-- index: a way to sort your records
	-- all primary keys are indexes
	-- Once an index is created, no further intervention is required:
	-- the system will update the index when the table is modified, 
	-- and it will use the index in queries when it thinks this would be more efficient than a sequential table scan
create index first_name_index on students(first_name desc);

drop index if exists first_name_index;