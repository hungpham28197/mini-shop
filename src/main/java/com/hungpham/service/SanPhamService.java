package com.hungpham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungpham.dao.SanPhamDAO;
import com.hungpham.dao.imp.SanPhamImp;
import com.hungpham.entity.SanPham;

@Service
public class SanPhamService implements SanPhamImp {

	@Autowired
	SanPhamDAO sanPhamDAO;
	
	@Override
	public List<SanPham> getSanPhamLimit() {
		return sanPhamDAO.getSanPhamLimit();
	}

	@Override
	public SanPham layDanhSachChiTietSanPhamTheoMa(int masanpham) {
		return sanPhamDAO.layDanhSachChiTietSanPhamTheoMa(masanpham);
	}

}
