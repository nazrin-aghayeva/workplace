update users set password = 'ABC123ZXC' where password is null;
alter table users alter column password set not null;
create unique index users_name_uindex on users (name);
INSERT INTO public.users (id, age, name, password) VALUES (DEFAULT, null, 'Jim', 'q');
alter table users add discount int default 0;

select *
from users
         join "Groups" on "group"="Groups".id;

select *
from users u
         join "Groups" g on u."group"=g.id;

select * from users u, "Groups" g
where u."group"=g.id;

select u.id, u.name, g.id, g."Name"
from users u
         join "Groups" g on (u."group"=g.id);

select u.id, u.name, g.id, g."Name"
from users u
         inner join "Groups" g on (u."group"=g.id);

select u.id, u.name, g.id, g."Name"
from users u
         left outer join "Groups" g on (u."group"=g.id);

select u.id, u.name, g.id, g."Name"
from users u
         right outer join "Groups" g on (u."group"=g.id);

select u.id, u.name, g.id, g."Name"
from users u
         full outer join "Groups" g on (u."group"=g.id);

