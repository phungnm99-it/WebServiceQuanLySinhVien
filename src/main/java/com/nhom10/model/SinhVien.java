package com.nhom10.model;

import java.sql.Date;

public class SinhVien {
	private int maSinhVien;
	private String hoLot;
	private String ten;
	private String lop;
	private boolean nu;
	private int khoa;
	private Date ngaySinh;
		
	public SinhVien(int maSV, String hoLot, String ten, String lop, boolean nu, int khoa, Date ngaySinh) {
		this.maSinhVien = maSV;
		this.hoLot = hoLot;
		this.ten = ten;
		this.lop = lop;
		this.nu = nu;
		this.khoa = khoa;
		this.ngaySinh = ngaySinh;
	}
	
	public int getMaSinhVien() {
		return maSinhVien;
	}
	
	public String getHoLot() {
		return hoLot;
	}
	public void setHoLot(String hoLot) {
		this.hoLot = hoLot;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int getKhoa() {
		return khoa;
	}
	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}
	public boolean isNu() {
		return nu;
	}
	public void setNu(boolean nu) {
		this.nu = nu;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
}
