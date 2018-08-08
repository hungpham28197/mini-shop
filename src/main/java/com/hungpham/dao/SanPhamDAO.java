package com.hungpham.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hungpham.dao.imp.SanPhamImp;
import com.hungpham.entity.SanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<SanPham> getSanPhamLimit() {
		Session session = sessionFactory.getCurrentSession();
		List<SanPham> listSP = session.createQuery("from SANPHAM").setMaxResults(8).getResultList();
		return listSP;
	}

	@Override
	@Transactional
	public SanPham layDanhSachChiTietSanPhamTheoMa(int masanpham) {
		Session session = sessionFactory.getCurrentSession();
		SanPham sanPham = (SanPham) session.createQuery("from SANPHAM sp where sp.masanpham="+masanpham).getSingleResult();
		
		return sanPham;
	}

}
