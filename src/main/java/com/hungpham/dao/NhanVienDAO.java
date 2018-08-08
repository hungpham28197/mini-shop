package com.hungpham.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.hungpham.dao.imp.NhanVienImp;
import com.hungpham.entity.NhanVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean XuLiDangNhap(String name, String pass) {
		Session session = sessionFactory.getCurrentSession();

		try {
			NhanVien nhanVien = (NhanVien) session.createQuery("FROM NHANVIEN nv WHERE nv.tendangnhap = " + "'" + name + "' AND nv.matkhau=" + "'" + pass +"'").getSingleResult();
			if(nhanVien != null) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	@Override
	@Transactional
	public boolean ThemNhanVien(NhanVien nhanVien) {
		Session session = sessionFactory.getCurrentSession();
		session.save(nhanVien);
		
		return true;
	}

}
