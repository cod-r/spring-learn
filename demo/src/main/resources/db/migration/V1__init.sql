create table person (
    id int primary key,
    firstName text not null,
    lastName text not null,
    age int not null,
    gender text not null
);
create sequence person_seq;

create table address (
    id int primary key,
    streetName text not null,
    streetNumber int not null,
    fk_person int references person(id)
);
create sequence address_seq;