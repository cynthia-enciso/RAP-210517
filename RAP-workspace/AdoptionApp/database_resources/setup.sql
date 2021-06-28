drop TABLE if EXISTS users cascade;
drop table if exists animals cascade;

create table if not exists users(
	user_id serial primary key,
	name text,
	funds numeric,
	username text not null unique,
	pass text not null
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
	adoptionDate date,
	owner_id integer references users (user_id) on delete cascade
);

--alter table animals add constraint animals_users_fkey foreign key (owner_id) references users (user_id) on delete cascade;

