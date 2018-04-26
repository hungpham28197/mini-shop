package com.hungpham.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hungpham.entity.NhanVien;

@Controller
public class DangNhapController {

	@Autowired
	SessionFactory sessionFactory;

	@GetMapping("/dangnhap")
	public String dangNhap() {

		return "dangnhap";
	}

	@PostMapping("/dangnhap")
	@Transactional
	public String dangNhap(@ModelAttribute("tendangnhap") String name, @ModelAttribute("matkhau") String pass) {
		Session session = sessionFactory.getCurrentSession();

		try {
			NhanVien nhanVien = (NhanVien) session.createQuery("FROM NHANVIEN nv WHERE nv.tendangnhap = " + "'" + name + "' AND nv.matkhau=" + "'" + pass +"'").getSingleResult();
			if(nhanVien != null) {
				System.out.println("Dang nhap thanh cong");
				return "redirect:/";
			}
		} catch (Exception e) {
			System.out.println("Dang nhap that bai");
		}
		
		return "dangnhap";
	}
}
