-- pl/pgSQL: procedural language that allows you to extend functionality of postgres by creating
	-- functions
	-- stored procedures
	-- triggers
	-- and adding control structures (if, case, loops)

-- functions are used to have a callable code block (but no CRUD operations)
	-- so for returning a value from another function or a query

--create function function_name(param_list) 
--    returns datatype
--language lang_name
--as 
-- $$function_body$$ or 'function body'

-- function bodies can be in single quotes or surrounded by dollar signs
	-- if single quotes, you need to escape your backslashes or commas
	-- no need to do that with dollar signs

CREATE or replace FUNCTION student_count() 
returns integer 
language plpgsql as 
-- block of code
$$
declare
-- variables
	student_count integer = 0; -- := or =
begin
	select count(*) into student_count from students;
	return student_count;
end;
$$

-- call function
select student_count();

-- drop function
drop function if exists student_count();

-- example:
create or replace function truncate_all() 
returns void
language plpgsql as 
$$
begin
	-- drop constraints
	alter table principals drop constraint principals_school_id_fkey;
	alter table schools drop constraint schools_principle_id_fkey;
	alter table students drop constraint students_school_id_fkey;
	alter table students_parents drop constraint students_parents_parent_id_fkey;
	alter table students_parents drop constraint students_parents_student_id_fkey;

	-- truncate tables
	truncate table students restart identity cascade;
	truncate table parents restart identity cascade;
	truncate table students_parents cascade;
	truncate table schools restart identity cascade;
	truncate table principals restart identity cascade;

	-- recreate the constraints
	alter table students add foreign key (school_id) references schools(school_id) on delete set null;
	alter table schools add foreign key (principle_id) references principals(principal_id);
	alter table principals add foreign key (school_id) references schools(school_id);
	alter table students_parents add foreign key (student_id) references students(student_id);
	alter table students_parents add foreign key (parent_id) references parents(parent_id);
end;
$$

select truncate_all();

select * from students;
select * from parents;
select * from students_parents;
select * from schools;
select * from principals;

-- sequence
create sequence if not exists my_positive_sequence
as int -- smallint, int, or bigint (default)
increment 1 -- which value to be added to sequence. can be + or -. 1 is default
no minvalue -- to not specify min. can be used with max.
maxvalue 10 -- you can also have a min value
start with 5;

select nextval('my_positive_sequence');

drop sequence if exists my_positive_sequence;

create table if not exists new_table(
	new_id integer
);

create sequence if not exists my_negative_sequence
as int
increment -1
maxvalue 10
owned by new_table.new_id;

insert into new_table values(nextval('my_negative_sequence'));

select * from new_table;
drop sequence if exists my_positive_sequence;
drop table if exists new_table;

-- trigger: function invoked when an event associated with a table occurs
	-- events: insert, update, delete or truncate
	-- two types: row level: for every row affected, the trigger happens that many times
	-- 			  statement level: runs once
	-- can run before or after the event

-- function
create or replace function insert_trigger_func()
returns trigger 
language plpgsql as
$$
begin
	raise notice 'record added!';
	return new;
end;
$$

--trigger
create trigger insert_trigger
after insert on parents
for each row
execute procedure insert_trigger_func();

insert into parents values (default, 'Fabian', 'Walters');
-- enable and disable trigger 
alter table parents disable trigger insert_trigger; -- or use all instead of name
insert into parents values (default, 'Alexandria', 'Wilkins');
alter table parents enable trigger all;
insert into parents values (default, 'Jerome', 'Tibbits');

drop trigger if exists insert_trigger on parents cascade; -- drop function that depends on it
-- stored procedure, same as a function but used for transactions/CRUD operations
	-- introduced in postgres 11 only!!
create or replace procedure go_away_bobs_kids() 
-- doesn't return a value! they just change or modify data
language plpgsql as 
-- block of code
$$
begin
	delete * from students where name in (select * from students_parents where parent_id = 1);
	commit;
end;
$$

call go_away_bobs_kids();