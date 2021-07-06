-- we're starting all over!
drop table if exists students cascade;
drop table if exists parents cascade;
drop table if exists schools cascade;
drop table if exists students_parents cascade;
drop table if exists principals cascade;

-- #1: create just tables first
------ show that you can use "" to keep capitalization
------ show that casing doesn't matter with sql commands

-- #2: add in constraints and explain them
----- constraints: column attributes that restrict data
	-- primary key: column whose value must be unique so a record can have a unique identifier
	-- foreign key: column in one table that references a column in another table
	-- unique: column's value should not be duplicated in another row
	-- not null: value in column cannot be null
	-- check: ensures that the value in the column meets a specific condition
	-- default: if no value supplied, default value is given instead of null

-- column constraint vs table constraint:
	-- constraint defined in column definition
	-- constraint defind on its own line
	-- column constraints can almost always be writte at table constraints
-- constraints can be named or given default name
	-- to name a constraint, use constraint keyword

-- #3. add in referential integrity:
	-- cascade
	-- restrict: prevents deletion of a referenced row
	-- no action*: same as restriction, however check is deferred until later in transaction
	-- set null*: deleted row's column values are set to null
	-- set default*: deleted row's column values are set to defaults
	-- * can lead to orphaned data

create table if not exists schools(
	school_id serial primary key unique not null, -- implicit 
	name text not null unique,
	address text,
	-- can't do foreign key yet because principals table not created yet
	-- principal_id references principals(principal_id)
	principal_id integer
);

create table if not exists students(
	-- notice it's student_id and not id to reduce ambiguity
	student_id serial primary key, -- must not be null and must be unique! 
	first_name text,
	last_name text,
	-- named constraint
	gpa decimal constraint positive_gpa check (gpa > 0) default 0,
	-- gpa decimal check (gpa > 0) default 0,
	school_id integer references schools(school_id) on delete set null --on delete cascade 
	--- n:1 relationship with school
);

create table if not exists parents(
	parent_id serial primary key, 
	first_name text,
	last_name text
);

-- join/association/bridge/junction table for n:n relationships
-- composite primary key that is made up of foreign keys
create table if not exists students_parents(
	student_id integer references students(student_id) on delete set null --on delete cascade,
	parent_id integer references parents(parent_id) on delete set null --on delete cascade,
	primary key (student_id, parent_id)
);

create table if not exists principals(
	principal_id serial primary key, 
	first_name text,
	last_name text,
	tenure numeric,
	-- named vs given default name
	-- school_id integer references schools(school_id)
	school_id integer,
	constraint school_fk foreign key(school_id) references schools(school_id) on delete set null --on delete cascade
	
);

-- statements can be across multiple lines
alter table schools
add constraint schools_principals_fk
foreign key (principal_id)
references principals(principal_id) on delete set null --on delete cascade;