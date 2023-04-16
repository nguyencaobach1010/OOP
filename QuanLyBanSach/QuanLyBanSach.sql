CREATE DATABASE QLBanSach;
USE QLBanSach;

create table NhaXuatBan (
MaNXB varchar(255),
TenNXB varchar(255),
DiaChi varchar(100),
DienThoai int,
Primary key (MaNXB)
);

create table TacGia(
MaTacGia char(10),
TenTacGia varchar(50),
DiaChi varchar(255),
TieuSu varchar(255),
SoDienThoai int,
Primary key (MaTacGia)
);

create table ChuDe(
MaChuDe char(30),
TenChuDe varchar(50),
Primary key (MaChuDe)
);

create table Sach(
MaSach varchar(50),
TenSach varchar(50),
GiaBan float,
MoTa varchar(100),
AnhBia longblob,
NgayCapNhat timestamp,
SoLuongTon int,
Id_MaNXB varchar(255),
Id_MaTacGia char(10),
Id_MaChuDe char(30),
Primary Key (MaSach),
foreign key (Id_MaNXB) references NhaXuatBan(MaNXB),
foreign key (Id_MaTacGia) references TacGia(MaTacGia),
foreign key (Id_MaChuDe) references ChuDe(MaChuDe)
);

create table ChiTietTacGia(
Id_MaTacGia varchar(255),
Id_MaSach varchar(255),
VaiTro varchar(255),
ViTri varchar(255),
Primary key(Id_MaTacGia,Id_MaSach),
foreign key(Id_MaTacGia) references TacGia(MaTacGia),
foreign key(Id_MaSach) references Sach(MaSach)
);

create table DonHang(
MaDonHang varchar(50),
DaThanhToan bit(1), 
NgayGiao datetime,
NgayDat datetime,
TinhTrangGH varchar(100),
Id_MaSach varchar(50),
primary key (MaDonHang),
foreign key (Id_MaSach) references Sach(MaSach)
);

create table ChiTietDonHang(
SoLuong int,
DonGia float,
Id_MaDonHang varchar(50),
Id_MaSach varchar(50),
primary key (Id_MaDonHang,Id_MaSach),
foreign key(Id_MaDonHang)references DonHang(MaDonHang),
foreign key(Id_MaSach) references Sach(MaSach)
);

create table KhachHang(
MaKH varchar(255),
TaiKhoan varchar(255),
MatKhau varchar(255),
HoTen varchar(255),
NgaySinh timestamp,
GioiTinh char(3),
DiaChi varchar(255),
Email varchar(255),
SoDienThoai int,
Id_MaDonHang varchar(50),
Primary key (MaKH),
foreign key (Id_MaDonHang) references DonHang(MaDonHang)
);
