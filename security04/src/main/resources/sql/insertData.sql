insert into T_USERS (D_USERNAME, D_PASSWORD, D_ENABLED)
values ('user1', 'user1', TRUE);
insert into T_USERS (D_USERNAME, D_PASSWORD, D_ENABLED)
values ('admin', 'admin', TRUE);
insert into T_USER_ROLES (D_USER_ROLE_ID, D_USERNAME, D_ROLE)
values (1, 'user1', 'ROLE_USER');
insert into T_USER_ROLES (D_USER_ROLE_ID, D_USERNAME, D_ROLE)
values (2, 'admin', 'ROLE_USER');
insert into T_USER_ROLES (D_USER_ROLE_ID, D_USERNAME, D_ROLE)
values (3, 'admin', 'ROLE_ADMIN');
