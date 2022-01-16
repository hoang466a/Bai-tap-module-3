
use order_product;
create table customer(
cID int primary key auto_increment,
`name` varchar(25),
`cage` tinyint
);
delete `customer`.* from `customer`;
insert into customer
values('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);

create table `order`(
oID int primary key auto_increment,
cID int,
`oDate` datetime,
oTotalPrice int,
foreign key (cID) references customer(cID)
);
delete `order`.* from `order`;
insert into `order`
values(1,'2006-3-21',null),(2,'2006-3-23',null),(1,'2006-3-16',null);

create table `product`(
pID int primary key auto_increment, 
pName varchar(25),
pPrice int
);

delete `product`.* from `product`;

insert into `order`
values(1,`may giat`,3),(2,`may giat`,3),(1,`may giat`,3),(1,`may giat`,3),(1,`may giat`,3)


