select * from persons where birthday > '2008-01-01';

select count(*), sex from persons group by sex;

select name, hobbie_id from persons join person_hobbie on persons.id = person_hobbie.hobbie_id;


select persons.name from persons join person_hobbie on persons.id = person_hobbie.person_id
group by persons.name having count(hobbie_id) > 1;

select persons.name from persons
join person_hobbie on persons.id = person_hobbie.person_id
join hobbies on person_hobbie.hobbie_id = hobbies.id
join hobbie_type on hobbies.id = hobbie_type.id where hobbie_type.name = 'Passive hobbie' group by persons.name;

select hobbie_type.name, count(hobbie_type.name) from hobbies join hobbie_type on hobbies.type = hobbie_type.id
group by hobbie_type.name;

select hobbies.name, hobbie_type.name from hobbies join hobbie_type on hobbies.type = hobbie_type.id;