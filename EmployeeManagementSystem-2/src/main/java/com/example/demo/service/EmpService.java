
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Emp;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	public EmpRepository employeeRepo;
	public List<Emp> getAllEmp()
	{
		List<Emp> employee=new ArrayList<>();
		employeeRepo.findAll().forEach(employee::add);
		return employee;
	}
	public void addEmp( Emp employee) {
		employeeRepo.save(employee);
		
	}
	public void updateEmp(String id,  Emp employee) {
		employeeRepo.save(employee);
		
	}
	public void deleteEmp(String id) {
		employeeRepo.deleteById(id);
		
	}
	
	
}