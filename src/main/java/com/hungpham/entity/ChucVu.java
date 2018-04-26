package com.hungpham.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CHUCVU")
public class ChucVu {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int machucvu;
	
	private String tenchucvu;
	
	public ChucVu() {
	}

	public ChucVu(int machucvu, String tenchucvu) {
		super();
		this.machucvu = machucvu;
		this.tenchucvu = tenchucvu;
	}

	public int getMachucvu() {
		return machucvu;
	}

	public void setMachucvu(int machucvu) {
		this.machucvu = machucvu;
	}

	public String getTenchucvu() {
		return tenchucvu;
	}

	public void setTenchucvu(String tenchucvu) {
		this.tenchucvu = tenchucvu;
	}

	@Override
	public String toString() {
		return "ChucVu [machucvu=" + machucvu + ", tenchucvu=" + tenchucvu + "]";
	}
	
}
