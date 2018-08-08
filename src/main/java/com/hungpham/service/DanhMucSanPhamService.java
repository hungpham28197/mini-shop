package com.hungpham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungpham.dao.DanhMucSanPhamDAO;
import com.hungpham.dao.imp.DanhMucSanPhamImp;
import com.hungpham.entity.DanhMucSanPham;

@Service
public class DanhMucSanPhamService implements DanhMucSanPhamImp {

	@Autowired
	DanhMucSanPhamDAO danhMucSanPhamDAO;
	
	@Override
	public List<DanhMucSanPham> getAll() {
		return danhMucSanPhamDAO.getAll();
	}

}
