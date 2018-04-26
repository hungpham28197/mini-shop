package com.hungpham.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="CHITIETSANPHAM")
public class ChiTietSanPham {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int machitietsanpham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="masanpham")
	private SanPham sanpham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="masize")
	private SizeSanPham sizesanpham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mamau")
	private MauSanPham mausanpham;
	
	private int soluong;
	private String ngaynhap;
	
	public ChiTietSanPham() {
	}

	public int getMachitietsanpham() {
		return machitietsanpham;
	}

	public void setMachitietsanpham(int machitietsanpham) {
		this.machitietsanpham = machitietsanpham;
	}

	public SanPham getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}

	public SizeSanPham getSizesanpham() {
		return sizesanpham;
	}

	public void setSizesanpham(SizeSanPham sizesanpham) {
		this.sizesanpham = sizesanpham;
	}

	public MauSanPham getMausanpham() {
		return mausanpham;
	}

	public void setMausanpham(MauSanPham mausanpham) {
		this.mausanpham = mausanpham;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	@Override
	public String toString() {
		return "ChiTietSanPham [machitietsanpham=" + machitietsanpham + ", sanpham=" + sanpham + ", sizesanpham="
				+ sizesanpham + ", mausanpham=" + mausanpham + ", soluong=" + soluong + ", ngaynhap=" + ngaynhap + "]";
	}
	
}
