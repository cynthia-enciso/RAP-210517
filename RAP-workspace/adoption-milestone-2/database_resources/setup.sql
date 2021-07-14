drop table if exists users cascade;
drop table if exists animals cascade;
drop table if exists offers cascade;
drop table if exists adoptions cascade;

create table if not exists users(
	username text primary key,
	pass text not null,
	name text,
	funds double
);

create table if not exists animals(
	animal_id serial primary key,
	status text not null,
	name text not null,
	price numeric not null,
	age integer not null,
	breed text not null,
	species text not null,
	temperament text not null,
	owner_username text references users(username) on delete set null
);

create table if not exists offers(
	offer_id serial primary key,
	status text,
	offer_username text references users(username) on delete set null,
	animal_id integer references animals(animal_id) on delete set null
);

create table if not exists adoptions(
	adoption_id serial primary key,
	adoption_date date,
	owner_username text,
	animal_id integer
);
