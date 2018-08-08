package com.hungpham.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hungpham.entity.NhanVien;
import com.hungpham.service.NhanVienService;

@Controller
public class DangKyController {

	@Autowired
	NhanVienService nhanVienService;
	
	@GetMapping("/dangky")
	public String dangKy() {

		return "dangky";
	}
	
	@PostMapping("/dangky")
	public String dangky(@RequestParam String emaildangky, @RequestParam String matkhaudangky, @RequestParam String nhaplaimatkhau, ModelMap modelMap) {
		boolean ktra = validate(emaildangky);
		
		if(ktra) { 
			if (matkhaudangky.equals(nhaplaimatkhau)) {
				NhanVien nhanVien = new NhanVien();
				nhanVien.setEmail(emaildangky);
				nhanVien.setTendangnhap(emaildangky);
				nhanVien.setMatkhau(matkhaudangky);
				
				boolean kiemtra = nhanVienService.ThemNhanVien(nhanVien);
				
				if (kiemtra) {
					modelMap.addAttribute("kiemtradangky", "Tạo tài khoản thành công");
				} else {
					modelMap.addAttribute("kiemtradangky", "Tạo tài khoản thất bại");
				}
				
			} else {
				modelMap.addAttribute("kiemtradangky", "Mật khẩu không trùng khớp");
			}
		} else {
			modelMap.addAttribute("kiemtradangky", "Vui lòng nhập email đúng định dạng");
		}
		
		return "dangky";
	}

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		return matcher.find();
	}

}
