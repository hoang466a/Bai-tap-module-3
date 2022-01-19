use furama;
create table vi_tri(
ma_vi_tri Int primary key auto_increment not null,
ten_vi_tri varchar(45) unique
);

insert into vi_tri
values(1,"Quản Lý"),(2,"Nhân Viên")
;

create table trinh_do(
ma_trinh_do Int primary key auto_increment not null,
ten_trinh_do varchar(45) unique
);

insert into trinh_do
values(1,	"Trung Cấp"),
(2,	"Cao Đẳng"),
(3,	"Đại Học"),
(4,	"Sau Đại Học")
;

create table bo_phan(
ma_bo_phan Int primary key auto_increment not null,
ten_bo_phan varchar(45) unique
);

insert into bo_phan
values(1,	"Sale-Marketing"),
(2,	"Hành chính"),
(3,	"Phục vụ"),
(4,	"Quản lý")
;

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

insert into nhan_vien
values(1,	"Nguyễn Văn An",	"1970-11-07",	"456231786",	10000000,	"0901234121",	"annguyen@gmail.com",	"295 Nguyễn Tất Thành, Đà Nẵng",	1,	3,	1),
(2,	"Lê Văn Bình",	"1997-04-09",	"654231234",	7000000,	"0934212314",	"binhlv@gmail.com",	"22 Yên Bái, Đà Nẵng",	1,	2,	2),
(3,	"Hồ Thị Yến",	"1995-12-12",	"999231723",	14000000,	"0412352315",	"thiyen@gmail.com",	"K234/11 Điện Biên Phủ, Gia Lai",	1,	3,	2),
(4,	"Võ Công Toản",	"1980-04-04",	"123231365",	17000000,	"0374443232",	"toan0404@gmail.com",	"77 Hoàng Diệu, Quảng Trị",	1,	4,	4),
(5,	"Nguyễn Bỉnh Phát",	"1999-12-09",	"454363232",	6000000,	"0902341231",	"phatphat@gmail.com",	"43 Yên Bái, Đà Nẵng",	2,	1,	1),
(6,	"Khúc Nguyễn An Nghi",	"2000-11-08",	"964542311",	7000000,	"0978653213",	"annghi20@gmail.com",	"294 Nguyễn Tất Thành, Đà Nẵng",	2,	2,	3),
(7,	"Nguyễn Hữu Hà",	"1993-01-01",	"534323231",	8000000,	"0941234553",	"nhh0101@gmail.com",	"4 Nguyễn Chí Thanh, Huế",	2,	3,	2),
(8,	"Nguyễn Hà Đông",	"1989-09-03",	"234414123",	9000000,	"0642123111",	"donghanguyen@gmail.com",	"111 Hùng Vương, Hà Nội",	2,	4,	4),
(9,	"Tòng Hoang",	"1982-09-03",	"256781231",	6000000,	"0245144444",	"hoangtong@gmail.com",	"213 Hàm Nghi, Đà Nẵng",	2,	4,	4),
(10,	"Nguyễn Công Đạo",	"1994-01-08",	"755434343",	8000000,	"0988767111",	"nguyencongdao12@gmail.com",	"6 Hoà Khánh, Đồng Nai",	2,	3,	2)
;

create table loai_khach(
ma_loai_khach Int primary key auto_increment not null,
ten_loai_khach varchar(45) unique
);

create table khach_hang(
ma_khach_hang int primary key auto_increment not null,
ma_loai_khach int,
ho_ten varchar(45) not null,
ngay_sinh datetime not null,
gioi_tinh bit(1) not null,
so_cmnd varchar(45) not null,
so_dien_thoai varchar(45) not null,
email varchar(45),
dia_chi varchar(45),
foreign key (ma_loai_khach) references loai_khach(ma_loai_khach)
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key auto_increment not null,
ten_dich_vu_di_kem varchar(45) not null,
gia double not null,
don_vi varchar(10) not null,
trang_thai varchar(45)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key auto_increment not null,
ma_hop_dong int,
ma_dich_vu_di_kem int,
so_luong int not null,
foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);

create table kieu_thue(
ma_kieu_thue int primary key auto_increment not null,
ten_kieu_thue varchar(45)
);

create table loai_dich_vu(
ma_loai_dich_vu int primary key auto_increment not null,
ten_loai_dich_vu varchar(45)
);

create table dich_vu(
ma_dich_vu int primary key auto_increment not null,
ten_dich_vu varchar(45) not null,
dien_tich int,
chi_phi_thue double not null,
so_nguoi_toi_da int, 
ma_kieu_thue int,
ma_loai_dich_vu int,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);

create table hop_dong(
ma_hop_dong int primary key not null auto_increment,
ngay_lam_hop_dong datetime not null,
tien_dat_coc double not null,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key(ma_dich_vu) references dich_vu(ma_dich_vu)
);






