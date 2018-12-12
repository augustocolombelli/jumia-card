#### 1- Create the database
1.1 - Install MySql version 5.7; <br/>
1.2 - Create a user "root" with password "root"; <br/>
1.3 - In CMD, open folder: C:\Program Files\MySQL\MySQL Server 5.7\bin <br/>
1.4 - Starting use the MySql with command "mysql -u root -p"; <br/>
1.5 - Create the database with command "create database card_manager"; <br/>

#### 2 - Run
2.1 - Import the in eclipse as a Maven Project;<br/>
2.2 - Run the main class "RunApplication.java";<br/>
2.3 - After this, the tables will be created;<br/>

#### 3 - Insert data
insert into bank (id, name) values (1, 'Santander');
 
insert into bank (id, name) values (2, 'Activo Bank');

insert into card (number, scheme, type, bank_id, valid) values (55223366558, 'VISA', 'DEBIT', 1, 0);

insert into card (number, scheme, type, bank_id, valid) values (66556655884, 'MASTERCARD', 'CREDIT', 1, 0);

insert into card (number, scheme, type, bank_id, valid) values (99223366558, 'VISA', 'CREDIT', 2, 1);

insert into card (number, scheme, type, bank_id, valid) values (77556655884, 'MASTERCARD', 'DEBIT', 2, 1);

#### 4 - Generate JAR file
4.1 - In eclipse, run project as Maven build...;<br/>
4.2 - Set in goals field "package";<br/>
4.3 - In CMD, run the command "java -jar file.jar" in the directory of jar; 

#### 5 - Run Service
5.1 - In browser or other HTTP (like postman). Open this URL "http://localhost:8080/api/card-scheme/verify/77556655884" with GET method; <br/>
5.2 - Default user and password is "admin" and "admin";
