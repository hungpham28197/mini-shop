package com.hungpham.dao.imp;

import com.hungpham.entity.NhanVien;

public interface NhanVienImp {
	
	boolean XuLiDangNhap(String name, String pass);
	boolean ThemNhanVien(NhanVien nhanVien);
}
