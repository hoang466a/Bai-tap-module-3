create database demo;
use demo;
create table Products(
Id int,
productCode int,
productName varchar(50),
productPrice int,
productAmount int,
productDescription varchar(50),
productStatus bit
);

insert into `products`
values(1,1,'aloha',1,1,'aloha1',1),(2,2,'bloha',2,2,'bloha2',0),(3,3,'cloha',3,3,'cloha3',1),(4,4,'dloha',4,4,'dloha5',1),(5,5,'eloha',5,5,'eloha5',1);

create index `unique` on products(productcode);

create index `composite` on products(productname,productprice);

explain select * from products where productname="dloha"; 

create view products_view as select productCode, productName, productPrice, productStatus from `products`;
select * from products_view;

update products_view 
set productcode=10,productprice=100
where productname="cloha";
delete from products_view where productname="cloha";

DELIMITER//
create procedure `show_information`()
begin
select * from products
end//
DELIMITER;