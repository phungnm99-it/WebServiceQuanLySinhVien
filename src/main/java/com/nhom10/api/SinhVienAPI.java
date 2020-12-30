package com.nhom10.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nhom10.dao.SinhVienDAO;
import com.nhom10.model.SinhVien;

@RestController
public class SinhVienAPI {
	
	@Autowired
	private SinhVienDAO sinhVienDAO;
	
	@GetMapping("/sinhvien")
	public ResponseEntity<List<SinhVien>> getAllSinhVien() {
		return ResponseEntity.ok(sinhVienDAO.getAll());
	}
	
	@GetMapping("/sinhvien/detail")
	public ResponseEntity<SinhVien> getSinhVienById(@RequestParam int id) {
		return ResponseEntity.ok(sinhVienDAO.getById(id));
	}
	
	@PostMapping("/sinhvien")
	public ResponseEntity<Integer> addSinhVien(@RequestBody SinhVien sv) {
		return ResponseEntity.ok(sinhVienDAO.Add(sv));
	}
	
	@PutMapping("/sinhvien")
	public ResponseEntity<Integer> updateSinhVien(@RequestBody SinhVien sv) {
		return ResponseEntity.ok(sinhVienDAO.Update(sv));
	}
}