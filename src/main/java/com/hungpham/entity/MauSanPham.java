package com.hungpham.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="MAUSANPHAM")
public class MauSanPham {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mamau;
	private String tenmau;
	
	public MauSanPham() {
	}

	public int getMamau() {
		return mamau;
	}

	public void setMamau(int mamau) {
		this.mamau = mamau;
	}

	public String getTenmau() {
		return tenmau;
	}

	public void setTenmau(String tenmau) {
		this.tenmau = tenmau;
	}

	@Override
	public String toString() {
		return "MauSanPham [mamau=" + mamau + ", tenmau=" + tenmau + "]";
	}
	
}
