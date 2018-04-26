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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="SANPHAM")
public class SanPham {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int masanpham;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="madanhmuc")
	DanhMucSanPham danhmucsanpham;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="masanpham")
	Set<ChiTietSanPham> chitietsanpham;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CHITIETKHUYENMAI", 
	joinColumns= {@JoinColumn(name="masanpham",referencedColumnName="masanpham")},
	inverseJoinColumns={@JoinColumn(name="")})
	private Set<KhuyenMai> danhsachkhuyenmai;
	
	private String tensanpham;
	private String giatien;
	private String mota;
	private String hinhsanpham;
	
	public SanPham() {
	}

	public int getMasanpham() {
		return masanpham;
	}

	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}

	public DanhMucSanPham getDanhmucsanpham() {
		return danhmucsanpham;
	}

	public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
		this.danhmucsanpham = danhmucsanpham;
	}

	public Set<ChiTietSanPham> getChitietsanpham() {
		return chitietsanpham;
	}

	public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}

	public Set<KhuyenMai> getDanhsachkhuyenmai() {
		return danhsachkhuyenmai;
	}

	public void setDanhsachkhuyenmai(Set<KhuyenMai> danhsachkhuyenmai) {
		this.danhsachkhuyenmai = danhsachkhuyenmai;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public String getGiatien() {
		return giatien;
	}

	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getHinhsanpham() {
		return hinhsanpham;
	}

	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}

	@Override
	public String toString() {
		return "SanPham [masanpham=" + masanpham + ", danhmucsanpham=" + danhmucsanpham + ", chitietsanpham="
				+ chitietsanpham + ", danhsachkhuyenmai=" + danhsachkhuyenmai + ", tensanpham=" + tensanpham
				+ ", giatien=" + giatien + ", mota=" + mota + ", hinhsanpham=" + hinhsanpham + "]";
	}
	
}
