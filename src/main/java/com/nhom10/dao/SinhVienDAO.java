package com.nhom10.dao;

import java.util.List;


import com.nhom10.mapper.SinhVienMapper;
import com.nhom10.model.SinhVien;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SinhVienDAO extends JdbcDaoSupport {
 
    @Autowired
    public SinhVienDAO(DataSource dataSource) {
        this.setDataSource(dataSource);    
    }
    
    public List<SinhVien> getAll() {
    	String querySql = "SELECT MaSinhVien, HoLot, Ten, Lop, Nu, Khoa, NgaySinh FROM SinhVien";
        SinhVienMapper mapper = new SinhVienMapper();
        return this.getJdbcTemplate().query(querySql,mapper);
    }
    
    public SinhVien getById(int id) {
    	String querySql = "SELECT MaSinhVien, HoLot, Ten, Lop, Nu, Khoa, NgaySinh"
    			+ " FROM SinhVien"
    			+ " WHERE MaSinhVien=?";
    	Object[] params = new Object[] {id};
        SinhVienMapper mapper = new SinhVienMapper();
        return this.getJdbcTemplate().queryForObject(querySql, mapper, params);
    }
    
    public int Add(SinhVien sv) {
    	String querySql = "INSERT INTO SinhVien VALUES (?,?,?,?,?,?)";
    	Object[] params = new Object[] {sv.getHoLot(), sv.getTen(), sv.getLop(), sv.isNu(), sv.getKhoa(), sv.getNgaySinh()};
    	return this.getJdbcTemplate().update(querySql, params);
    }
    
    public int Update(SinhVien sv) {
    	String querySql = "UPDATE SinhVien"
    			+ " SET HoLot = ?, Ten = ?, Lop = ?, Nu = ?, Khoa = ?, NgaySinh = ?"
    			+ " WHERE MaSinhVien = ?";
    	Object[] params = new Object[] {sv.getHoLot(), sv.getTen(), sv.getLop(), sv.isNu(), sv.getKhoa(), sv.getNgaySinh(), sv.getMaSinhVien()};
    	return this.getJdbcTemplate().update(querySql, params);
    }
}