create table if not exists users
(
    id serial not null constraint users_pk primary key,
    age integer,
    name varchar,
    password varchar
);

create index if not exists idx_name on users (name desc);

create table if not exists "Groups"
(
    id serial not null constraint groups_pk primary key,
    "Name" varchar
);

alter table users add "group" int


