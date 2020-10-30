create table person (
    id int primary key,
    first_name text not null,
    last_name text not null,
    age int not null,
    gender text not null
);
create sequence person_seq;

create table address (
    id int primary key,
    street_name text not null,
    street_number int not null,
    fk_person int references person(id)
);
create sequence address_seq;