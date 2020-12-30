package com.nhom10.mapper;

import com.nhom10.model.SinhVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import org.springframework.jdbc.core.RowMapper;

public class SinhVienMapper implements RowMapper<SinhVien> {
	
	@Override
	public SinhVien mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		int maSV = rs.getInt("MaSinhVien");
		String hoLot = rs.getString("HoLot");
		String ten = rs.getString("Ten");
		String lop = rs.getString("Lop");
		boolean nu = rs.getBoolean("Nu");
		int khoa = rs.getInt("Khoa");
		Date ngaySinh = rs.getDate("NgaySinh");
		return new SinhVien(maSV,hoLot,ten,lop,nu,khoa,ngaySinh);
	}
	
}
