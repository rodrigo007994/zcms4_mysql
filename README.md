# zcms4
Simle yet secure Java Content Management System with a Postgres Database.
To configure the database and the email settings you need to access:
zcms/web/WEB-INF/web.xml and edit this part:

context-param: url, user, pass, email, emailpass, starttls, host, port

CREATE DATABASE `rodrigov_zendb`;

GRANT SELECT, EXECUTE, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, LOCK TABLES  ON `rodrigov\_zendb`.* TO 'rodrigov_zen'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

SET PASSWORD FOR 'rodrigov_zen'@'localhost' = PASSWORD('1234');
FLUSH PRIVILEGES;
