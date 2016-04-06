INSERT INTO users (username,password,enabled) VALUES ('user','user',TRUE);
INSERT INTO "public"."authorities" ("username", "authority") VALUES ('user', 'ROLE_USER');
INSERT INTO "public"."groups" ("id", "group_name") VALUES ('979c6877cb4448289039a75c6f251ccd', '群组一');
INSERT INTO "public"."group_members" ("id", "username", "group_id") VALUES ('e7463a760c6745d191579c8f4f19d40d', 'user', '979c6877cb4448289039a75c6f251ccd');
INSERT INTO "public"."group_authorities" ("group_id", "authority") VALUES ('979c6877cb4448289039a75c6f251ccd', 'ROLE_USER');