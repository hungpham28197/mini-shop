package com.hungpham.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungpham.dao.NhanVienDAO;
import com.hungpham.dao.imp.NhanVienImp;
import com.hungpham.entity.NhanVien;

@Service
public class NhanVienService implements NhanVienImp{

	@Autowired
	NhanVienDAO nhanVienDAO;

	@Override
	public boolean XuLiDangNhap(String name, String pass) {
		return nhanVienDAO.XuLiDangNhap(name, pass);
	}

	@Override
	public boolean ThemNhanVien(NhanVien nhanVien) {
		return nhanVienDAO.ThemNhanVien(nhanVien);
	}
	
}
