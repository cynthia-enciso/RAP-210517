-- create a principal for school
insert into principals values (default, 'Janet', 'Mills', 5, null);

-- create a school, assign principal
insert into schools values (default, 'West Lake Middle School', '22222 This Street Dr', 1);

-- assign school to principal
update principals set school_id = 1 where principal_id = 1;

-- create some parents
insert into parents values 	(default, 'Bob', 'Smith'),
							(default, 'Wanda', 'Jackson'),
							(default, 'Bryan', 'James'),
							(default, 'William', 'Foley'),
							(default, 'Amanda', 'Baxter'),
							(default, 'Jerry', 'Michaels');
-- create some students
insert into students values (default, 'Alba', 'Smith', 2.3, 1),
							(default, 'Tony', 'Smith', 3.8, 1),
							(default, 'Billy', 'Smith', 0.2, 1),
							(default, 'Maria', 'James', 3.4, 1),
							(default, 'Jacob', 'James', 2.2, 1),
							(default, 'Miles', 'Baxter', 3.4, 1),
							(default, 'Charlie', 'Baxter', 3.0, 1),
							(default, 'Nathaniel', 'Baxter', 4.0, 1),
							(default, 'Brooke', 'Baxter', 2.5, 1),
							(default, 'Carmen', 'Baxter', 3.5, 1);
						
-- map the students to parents
insert into students_parents values (1, 1),
									(1, 2),
									(2, 1),
									(2, 2),
									(3, 1),
									(3, 2),
									(4, 3),
									(4, 4),
									(5, 3),
									(5, 4),
									(6, 5),
									(6, 6),
									(7, 5),
									(7, 6),
									(8, 5),
									(8, 6),
									(9, 5),
									(9, 6),
									(10, 5),
									(10, 6);
delete from schools;

-- view all tables
select * from students;
select * from parents;
select * from students_parents;
select * from schools;
select * from principals;