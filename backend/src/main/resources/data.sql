INSERT INTO "public"."roles" VALUES (1, 'ROLE_USER');
INSERT INTO "public"."roles" VALUES (2, 'ROLE_MODERATOR');
INSERT INTO "public"."roles" VALUES (3, 'ROLE_ADMIN');

INSERT INTO "public"."users" VALUES (1, 'erikgv20@gmail.com', '$2a$10$3Va9x3UG0OWSXMx.nVJp4uPwauaUXvSOTjU02ijknOkXqyGwlaHzG', 'eguerrero');

INSERT INTO "public"."user_roles" VALUES (1, 1);
INSERT INTO "public"."user_roles" VALUES (1, 2);
INSERT INTO "public"."user_roles" VALUES (1, 3);