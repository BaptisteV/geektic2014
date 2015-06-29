drop table geek if exists cascade;
drop table hobby if exists cascade;
drop table geek_hobby if exists cascade;

drop sequence if exists geek_seq;
drop sequence if exists hobby_seq;

create table geek 
(
id_geek bigint not null,
name varchar(100) not null,
surname varchar(100) not null,
aka varchar(200),
city varchar(200) not null,
email varchar (200) not null,
primary key (id_geek)
);

create table hobby
(
id_hobby bigint not null,
title varchar(100) not null,
detail varchar(200),
primary key (id_hobby)
);

create table geek_hobby
(
id_hobby bigint not null,
id_geek int not null,
foreign key (id_hobby) references hobby(id_hobby),
foreign key (id_geek) references geek(id_geek)
);

create sequence geek_seq start with 0;
create sequence hobby_seq start with 0;