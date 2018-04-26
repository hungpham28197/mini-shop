package com.hungpham.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="KHUYENMAI")
public class KhuyenMai {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int makhuyenmai;
	
	private String tenkhuyenmai;
	private String thoigianbatdau;
	private String thoigianketthuc;
	private String mota;
	private String hinhkhuyenmai;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CHITIETSANPHAM", 
	joinColumns= {@JoinColumn(name="makhuyenmai",referencedColumnName="makhuyenmai")},
	inverseJoinColumns={@JoinColumn(name="")})
	private Set<SanPham> danhsachsanpham;
	
	public KhuyenMai() {
	}

	public int getMakhuyenmai() {
		return makhuyenmai;
	}

	public void setMakhuyenmai(int makhuyenmai) {
		this.makhuyenmai = makhuyenmai;
	}

	public String getTenkhuyenmai() {
		return tenkhuyenmai;
	}

	public void setTenkhuyenmai(String tenkhuyenmai) {
		this.tenkhuyenmai = tenkhuyenmai;
	}

	public String getThoigianbatdau() {
		return thoigianbatdau;
	}

	public void setThoigianbatdau(String thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}

	public String getThoigianketthuc() {
		return thoigianketthuc;
	}

	public void setThoigianketthuc(String thoigianketthuc) {
		this.thoigianketthuc = thoigianketthuc;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getHinhkhuyenmai() {
		return hinhkhuyenmai;
	}

	public void setHinhkhuyenmai(String hinhkhuyenmai) {
		this.hinhkhuyenmai = hinhkhuyenmai;
	}

	public Set<SanPham> getDanhsachsanpham() {
		return danhsachsanpham;
	}

	public void setDanhsachsanpham(Set<SanPham> danhsachsanpham) {
		this.danhsachsanpham = danhsachsanpham;
	}

	@Override
	public String toString() {
		return "KhuyenMai [makhuyenmai=" + makhuyenmai + ", tenkhuyenmai=" + tenkhuyenmai + ", thoigianbatdau="
				+ thoigianbatdau + ", thoigianketthuc=" + thoigianketthuc + ", mota=" + mota + ", hinhkhuyenmai="
				+ hinhkhuyenmai + ", danhsachsanpham=" + danhsachsanpham + "]";
	}
	
}
