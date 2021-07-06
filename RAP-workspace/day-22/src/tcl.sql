--- tcl: transaction control language, manages changes made by DML statements
	-- savepoint
	-- rollback
	-- commit

-- set autocommit = off;
	-- autocommit is a system variabe that is checked every time you run a comand
	-- with it off, changes not saved and data being manipulated may not be accessible to other users

-- savepoint: creates a backup point or snapshot of your data before making changes
	-- each savepoint has a name

-- rollback: rollback to savepoint to undo changes
	-- rolling back destroys all savepoints made after target savepoint
	-- you cannot rollback past a commit statement

-- always use savepoints when working with sensitive data

-- every sql statement is treated like it is being wrapped inside of a transaction

-- change in database > transaction mode
-- or with set transaction?

begin; -- implicit
select * from students;
select * from parents;
select * from students_parents;
select * from schools;
select * from principals;
commit; -- impclicit

-- example of a transaction block
begin;
-- change Jacob's name to Tommy
update students set first_name = 'Tommy' where student_id = 5;
-- change Nathaniel's mom to Wanda
update students_parents set parent_id = 2 where parent_id = 6;
-- create savepoint
savepoint my_savepoint;
-- change school's address
update schools set name = 'Uptown High School' where school_id = 1;
rollback to my_savepoint;
-- update principal's last name
update principals set last_name = 'Milton' where principal_id = 1;
commit;

-- view all tables
select * from students;
select * from parents;
select * from students_parents;
select * from schools;
select * from principals;