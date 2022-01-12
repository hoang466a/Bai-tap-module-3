create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
customer_id int auto_increment primary key,
customer_name varchar(50),
customer_age int
);

create table `order`(
order_id int primary key,
order_date varchar(20),
order_total_price int,
customer_id int,
foreign key(customer_id) references customer(customer_id)
);

create table product(
product_id int primary key,
product_name varchar(70),
product_price int
);

create table order_detail(
product_id int,
order_id int,
order_quantity int,
primary key(product_price,order_id),
foreign key(product_id) references product(product_id),
foreign key(order_id) references `order`(order_id)
);
