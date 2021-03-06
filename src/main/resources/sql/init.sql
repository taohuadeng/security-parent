--创建数据库验证的脚本
CREATE TABLE T_USERS (
	d_username VARCHAR (50) NOT NULL,
	d_password VARCHAR (60),
	d_enabled bool
);

ALTER TABLE T_USERS ADD CONSTRAINT PK_USERS_USERNAME PRIMARY KEY (D_USERNAME);

CREATE TABLE T_USER_ROLES (
	d_user_role_id VARCHAR (10) NOT NULL,
	d_username VARCHAR (50),
	d_role VARCHAR (50)
);

ALTER TABLE T_USER_ROLES ADD CONSTRAINT PK_USER_ROLES PRIMARY KEY (D_USER_ROLE_ID);

ALTER TABLE T_USER_ROLES ADD CONSTRAINT IDX_UNI_ROLE_USERNAME UNIQUE (D_USERNAME, D_ROLE);

----------**********----------
CREATE TABLE USERS (
	username VARCHAR (50) NOT NULL,
	password VARCHAR (60),
	enabled bool
);

CREATE TABLE AUTHORITIES (
	username VARCHAR (50),
	authority VARCHAR (100)
);
