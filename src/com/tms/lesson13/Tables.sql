create table if not exists persons(
id bigserial primary key,
name varchar(20),
sex bool not null,
birthday date);
drop table persons;

create table if not exists hobbie_type(
id bigserial primary key,
name varchar(20));
drop table hobbie_type;

create table if not exists hobbies(
id bigserial primary key,
type bigserial,
name varchar(20),
foreign key (type) references hobbie_type(id));
drop table hobbies;


create table if not exists person_hobbie(
id bigserial primary key,
person_id bigserial,
hobbie_id bigserial,
foreign key (person_id) references persons (id),
foreign key (hobbie_id) references hobbies (id));
drop table person_hobbie;