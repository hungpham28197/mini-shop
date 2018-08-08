package com.hungpham.dao.imp;

import java.util.List;

import com.hungpham.entity.SanPham;

public interface SanPhamImp {

	List<SanPham> getSanPhamLimit();
	SanPham layDanhSachChiTietSanPhamTheoMa(int masanpham);
}
