package com.hungpham.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.hungpham.entity.DanhMucSanPham;
import com.hungpham.entity.SanPham;
import com.hungpham.service.DanhMucSanPhamService;
import com.hungpham.service.SanPhamService;

@Controller
public class TrangChuController {

	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucSanPhamService danhMucSanPhamService;
	
	@GetMapping("/")
	public String trangChu(ModelMap modelMap, HttpSession httpSession) {

		if (httpSession.getAttribute("emailUser") != null) {
			String email = (String) httpSession.getAttribute("emailUser");
			String chucaidau = email.substring(0, 1).toUpperCase();
			modelMap.addAttribute("chucaidau",chucaidau);
		}
		
		List<SanPham> listSanPham = sanPhamService.getSanPhamLimit();
		modelMap.addAttribute("listSanPham", listSanPham);

		List<DanhMucSanPham> listDanhMucSP = danhMucSanPhamService.getAll();
		modelMap.addAttribute("listDanhMucSP", listDanhMucSP);
		
		return "trangchu";
	}
	
}
