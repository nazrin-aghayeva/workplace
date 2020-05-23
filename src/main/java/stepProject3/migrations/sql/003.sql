-- 2020.05.16
alter table users add groupp int;

alter table users
    add constraint users_fk
        foreign key (groupp) references groups;
