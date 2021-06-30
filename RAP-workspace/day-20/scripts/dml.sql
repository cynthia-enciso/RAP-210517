-- DML: Data Manipulation Language, CRUD operations (create, read, update, and delete)

/* -------------------------- insert --------------------------------*/
-- inserting one record
insert into students(name, gpa, graduation) values('Billy', 4.0, '2020-03-03');

-- inserting multiple records
insert into students(name, gpa, graduation) values
	('Kathrine', 2.0, '2020-04-15'), 
	('Abraham', 1.5, null),
	('Carol', 3.5, '2020-12-22'),
	('Kyle', null, null),
	('Edwina', 4.0, '2019-02-13'),
	('Lyle', 1.5, '2015-04-20'),
	('Jackson', 2.0, '2021-03-24'),
	('Feddie', null, '2016-02-15'),
	('Michael', 1.0, null),
	('Jamie', 4.0, '2014-03-12'),
	('Abigail', 3.2, '2019-08-01'),
	('Emily', 4.0, '2015-04-20'),
	('Emily', 4.0, '2015-04-20')
;

-- a record without specifying table columns
insert into students values(default, 'Charles', 3.5, '2018-04-13');

-- returning clause: returns the record(s) that have been modified
insert into students(name, gpa, graduation) values('Daniel', 2.3, '2020-03-10');
insert into students(name, gpa, graduation) values('Christie', 2.0, '2020-03-10') returning *;

/* -------------------------- update --------------------------------*/
-- update one record
update students set gpa = 0.5 where name = 'Kyle';
-- updating multiple records
update students set gpa = 2.5 where id > 15 returning *;
-- updating one record, multiple columns
update students set gpa = 2.8, graduation = '2020-05-12' where id = 5 returning *;


/* -------------------------- delete --------------------------------*/
-- removes all records
delete from students;
-- removes all records, resets the auto-incrementing column
truncate students restart identity;
delete from students where gpa is null;

