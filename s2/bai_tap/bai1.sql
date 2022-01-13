create database bai1;
use bai1;
create	table phieuxuat(
sopx int primary key,
ngaypx int
);

create table chitietphieuxuat(
dgxuat int,
slxuat int,
sopx int,
mavt int,
primary key(sopx,mavt),
foreign key (sopx) references phieuxuat(sopx),
foreign key (mavt) references vattu(mavt)
);

create table vattu(
mavt int primary key,
tenvattu varchar(70)
);

create table chitietphieunhap(
dgnhap int,
slnhap int,
sopn int,
mavt int,
primary key(sopn,mavt),
foreign key (sopn) references phieunhap(sopn),
foreign key (mavt) references vattu(mavt)
);

create table phieunhap(
sopn int primary key,
ngaynhap int 
);

create table dondh(
sodh int primary key,
ngaydh int,
mancc int,
foreign key(mancc) references nhacc(mancc)
);

create table chitietdondh(
sodh int,
mavt int,
primary key (sodh,mavt),
foreign key (sodh) references dondh(sodh),
foreign key (mavt) references vattu(mavt)
);


create table nhacc(
mancc int primary key,
tenncc varchar(70),
diachi varchar(70),
sdt varchar(70)
);

