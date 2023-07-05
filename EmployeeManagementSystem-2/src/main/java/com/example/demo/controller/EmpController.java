
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Emp;
import com.example.demo.service.EmpService;

@RestController
public class EmpController 
{
       @Autowired
	  private EmpService employeeservice;
	  
       @GetMapping("/employee")
	  public List<Emp> getAllEmp()
	  {
		  return employeeservice.getAllEmp();
	  }
	   
       @PostMapping("/employee")
	  public void addEmp(@RequestBody Emp employee)
	   	{
	   		employeeservice.addEmp(employee); 
	   	}
       @RequestMapping(method = RequestMethod.PUT, value="/employee/{Id}")
 	  public void updateEmp(@PathVariable String Id,@RequestBody Emp employee)
 	   	{
 	   	employeeservice.updateEmp(Id,employee); 
 	   	}
      public void deleteEmp(@PathVariable String id)
	      {
	    	employeeservice.deleteEmp(id);
	      }
	}