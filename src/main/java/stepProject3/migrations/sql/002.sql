-- 2020.05.15.v2
create table groups
(
    id serial
        constraint groups_pk
            primary key,
    name int
)
