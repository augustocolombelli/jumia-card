### 1- Create the database
$ create database card_manager;

### 2 - Start the application
Run the application to create all tables.

### 3 - insert some data to test
insert into bank (id, name) values (1, 'Santander');

insert into bank (id, name) values (2, 'Activo Bank');

insert into card (number, scheme, type, bank_id, valid) values (55223366558, 'VISA', 'DEBIT', 1, 0);

insert into card (number, scheme, type, bank_id, valid) values (66556655884, 'MASTERCARD', 'CREDIT', 1, 0);

insert into card (number, scheme, type, bank_id, valid) values (99223366558, 'VISA', 'CREDIT', 2, 1);

insert into card (number, scheme, type, bank_id, valid) values (77556655884, 'MASTERCARD', 'DEBIT', 2, 1);

### 4 - Generate a jar
-> Run as Maven build...
-> goals = package
-> in cmd, java -jar <<name of project>>

### 5 - Test the service
-> Default user and password is "admin" and "admin";
-> http://localhost:8080/api/card-scheme/verify/77556655884