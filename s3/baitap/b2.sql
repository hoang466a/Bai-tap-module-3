
use order_product;
create table customer(
cID int primary key,
`name` varchar(25),
`cage` tinyint
);

insert into customer
values(1,'Minh Quan',10),(2,'Ngoc Oanh',20),(3,'Hong Ha',50);

create table `order`(
oID int primary key,
cID int,
`oDate` datetime,
oTotalPrice int,
foreign key (cID) references customer(cID)
);

insert into `order`
values(1,1,'2006-3-21',null),(2,2,'2006-3-23',null),(3,1,'2006-3-16',null)



