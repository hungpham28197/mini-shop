package com.hungpham.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hungpham.service.NhanVienService;

@Controller
@RequestMapping("api/")
@SessionAttributes("emailUser")
public class ApiController {

	@Autowired
	NhanVienService nhanVienService;

	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String KiemTraDangNhap(@RequestParam String email, @RequestParam String matkhau, ModelMap modelMap) {

		boolean kiemtra = nhanVienService.XuLiDangNhap(email, matkhau);
		
		if(kiemtra) {
			modelMap.addAttribute("emailUser", email);
		}
		
		return ""+kiemtra;
	}
}
