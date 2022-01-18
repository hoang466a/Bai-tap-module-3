use furama;
create table vi_tri(
ma_vi_tri Int primary key auto_increment not null,
ten_vi_tri varchar(45) unique
);

create table trinh_do(
ma_trinh_do Int primary key auto_increment not null,
ten_trinh_do varchar(45) unique
);

create table bo_phan(
ma_bo_phan Int primary key auto_increment not null,
ten_bo_phan varchar(45) unique
);

create table nhan_vien(
ma_nhan_vien int primary key auto_increment not null,
ho_ten varchar(45) not null,
ngay_sinh datetime not null,
so_cmnd varchar(45) not null,
luong double not null,
so_dien_thoai varchar(45) not null,
email varchar(45),
dia_chi varchar(45),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);

create table loai_khach(
ma_loai_khach Int primary key auto_increment not null,
ten_loai_khach varchar(45) unique
);

create table khach_hang(
ma_khach_hang int primary key auto_increment not null,
ma_loai_khach int,
ho_ten varchar(45) not null,
ngay_sinh datetime not null,
gioi_tinh bit not null,
 
);

