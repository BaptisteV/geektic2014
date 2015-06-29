delete from geek;
delete from hobby;
delete from geek_hobby;

insert into geek values(
0,
'Paul',
'Ho',
'LeCodeurFou',
'Paris',
'paulho@yopmail.com',
'H'
);

insert into geek values(
1,
'Jeanne',
'Darc',
'Chickago',
'Chicago',
'jeannedarc@yopmail.com',
'F'
);

insert into geek values(
0,
'René',
'Duchemin',
'LeRené',
'Mervans',
'reneduchemin@yopmail.com',
'H'
);

insert into hobby values (
0,
'C',
''
)
insert into hobby values (
1,
'C++',
''
)
insert into hobby values (
2,
'C#',
''
)
insert into hobby values (
3,
'Java',
''
)
insert into hobby values (
4,
'Javascript',
''
)
insert into hobby values (
5,
'Erlang',
''
)
insert into hobby values (
6,
'Python',
''
)

insert into geek_hobby values (
0,
2
)
insert into geek_hobby values (
1,
0
)
insert into geek_hobby values (
1,
1
)
insert into geek_hobby values (
2,
3
)
insert into geek_hobby values (
2,
5
)
insert into geek_hobby values (
2,
6
)
insert into geek_hobby values (
2,
0
)

