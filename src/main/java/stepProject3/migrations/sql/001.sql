-- 2020.05.14
create table users
(
    id serial
        constraint users_pk
            primary key,
    name int
)
