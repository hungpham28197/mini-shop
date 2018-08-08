package com.hungpham.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hungpham.dao.imp.DanhMucSanPhamImp;
import com.hungpham.entity.DanhMucSanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucSanPhamDAO implements DanhMucSanPhamImp{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<DanhMucSanPham> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<DanhMucSanPham> listDanhMucSanPham = session.createQuery("from DANHMUCSANPHAM").getResultList();
		
		return listDanhMucSanPham;
	}

}
