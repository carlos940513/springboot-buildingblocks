insert into user (id,user_name,first_name,last_name,email_address,role,ssn) values(101,'jcem_01@gmail.com','jose','mora','jcem_01@gma.com','DBA','2020');
insert into user (id,user_name,first_name,last_name,email_address,role,ssn) values(102,'elbarto@gmail.com','Bartolome','Simspon','barto@gma.com','DBA','2021');

insert into orders (orderid,orderdescription,user_id) values(2001,'order11',101);
insert into orders (orderid,orderdescription,user_id) values(2002,'order12',101);
insert into orders (orderid,orderdescription,user_id) values(2003,'order13',101);
insert into orders (orderid,orderdescription,user_id) values(2004,'order21',102);
insert into orders (orderid,orderdescription,user_id) values(2005,'order22',102);