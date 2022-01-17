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

DELIMITER //
create procedure `show_information`()
begin
select * from products;
end//
DELIMITER ;
call show_information;

DELIMITER //
create procedure `add_new_product`(in Id int,
productCode int,
productName varchar(50),
productPrice int,
productAmount int,
productDescription varchar(50),
productStatus bit)
begin
insert into products
value(Id,
productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus);
end //
DELIMITER ;
call `add_new_product`(15,11,'acv',15,17,'asloha23',1);

DELIMITER //
create procedure `update_product`(in
fixId int,
productCodeFix int,
productNameFix varchar(50),
productPriceFix int,
productAmountFix int,
productDescriptionFix varchar(50),
productStatusFix bit)
begin
SET SQL_SAFE_UPDATES = 0;
update products
set 
productCode=productCodeFix,
productName=productNameFix,
productPrice=productPriceFix,
productAmount=productAmountFix,
productDescription=productDescriptionFix,
productStatus=productStatusFix
where Id=FixId;
end //
DELIMITER ;
call `update_product`(10,14,'fix demo',1,7,'fix demo',1);

DELIMITER //
create procedure `delete_product`(in ID_delete int)
begin 
delete from products where Id=Id_delete;
end //
DELIMITER ;
call `delete_product`(5);
