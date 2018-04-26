package com.hungpham.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="CHITIETHOADON")
public class ChiTietHoaDon {
	
	@EmbeddedId
	ChiTietHoaDonId chiTietHoaDonId;
	
	private int soluong;
	private int giatien;
	
	public ChiTietHoaDon() {
	}

	public ChiTietHoaDonId getChiTietHoaDonId() {
		return chiTietHoaDonId;
	}

	public void setChiTietHoaDonId(ChiTietHoaDonId chiTietHoaDonId) {
		this.chiTietHoaDonId = chiTietHoaDonId;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getGiatien() {
		return giatien;
	}

	public void setGiatien(int giatien) {
		this.giatien = giatien;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [chiTietHoaDonId=" + chiTietHoaDonId + ", soluong=" + soluong + ", giatien=" + giatien
				+ "]";
	}

}
