insert into persons (name, sex, birthday) values
('Person1', true, '2000-10-15'),
('Person2', false, '2005-12-20'),
('Person3', true, '1998-05-12'),
('Person4', false, '2008-01-29'),
('Person5', true, '2015-08-16'),
('Person6', false, '2014-03-15'),
('Person7', true, '2003-04-28'),
('Person8', false, '1996-08-30'),
('Person9', true, '1986-09-20'),
('Person10', false, '2001-06-17');
select * from persons;

insert into hobbie_type (name) values ('Active hobbie'), ('Passive hobbie');
select * from hobbie_type;

insert into hobbies (name, type) values
('Football', 1),
('Chess', 2),
('Tennis', 1),
('Fishing', 2);
select * from hobbies;

insert into person_hobbie (person_id, hobbie_id) values
(1, 1),
(1, 4),
(2, 3),
(3, 3),
(4, 3),
(5, 2),
(6, 2),
(7, 1),
(8, 1),
(9, 1),
(9, 2),
(9, 3),
(9, 4),
(10, 2);
select * from person_hobbie;