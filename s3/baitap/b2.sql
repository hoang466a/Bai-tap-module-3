create database order_product;
use order_product;

SET FOREIGN_KEY_CHECKS=0;
create table `customer`(
cID int primary key auto_increment,
`name` varchar(25),
`cAge` tinyint
);
insert into `customer`
values(1,'Minh Quan',10),(2,'Ngoc Oanh',20),(3,'Hong Ha',50);

create table `order`(
oID int primary key auto_increment,
cID int,
`oDate` datetime,
oTotalPrice int,
foreign key (cID) references `customer`(cID)
);
insert into `order`
values(1,1,'2006-3-21',null),(2,2,'2006-3-23',null),(3,1,'2006-3-16',null);

create table `product`(
pID int primary key auto_increment, 
pName varchar(25),
pPrice int
);
insert into `product`
values(1,'may giat',3),(2,'tu lanh',5),(3,'dieu hoa',7),(4,'quat',1),(5,'bep dien',2);

create table `order_detail`(
oID int,
pID int , 
odQTY int,
foreign key (oID) references `order`(oID),
foreign key (pID) references `product`(pID)
);
insert into `order_detail`
values(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);

select oID,oDate,oTotalPrice from `order`;

select distinct `order`.cid,`product`.pId,`product`.pName 
from `customer` 
join `order` on `order`.cid=`customer`.cid
join `order_detail` on `order_detail`.oId=`order`.oId
join `product` on `product`.pId=`order_detail`.pId;

SELECT `customer`.cId,`customer`.name
FROM customer
WHERE NOT EXISTS (SELECT `order`.cId FROM `order` WHERE `order`.cId = `customer`.cid);












