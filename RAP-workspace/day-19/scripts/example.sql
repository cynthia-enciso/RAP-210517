/* multi-line comment*/

-- DELETE
drop table if exists students;

-- CREATE
-- create a table of students with id, name, gpa
create table if not exists students(
	id serial, -- primary key
	name text,
	gpa decimal
	-- primary key (id)
);

-- ALTER
alter table students add primary key (id);

-- DML
insert into students(name, gpa) values('Bob', 4.0);
insert into students(name, gpa) values('Bob', 4.0);
insert into students(name, gpa) values('Bob', 4.0);
alter table students add column graduation date;

-- UPDATE
update students set graduation = '2021-06-28';

-- TRUNCATE
truncate table students;

-- RENAME
--alter table students rename to other_students;
--alter table students rename name to studentName;

-- COMMENT
comment on table students is 'This is my comment';
comment on table students is null;