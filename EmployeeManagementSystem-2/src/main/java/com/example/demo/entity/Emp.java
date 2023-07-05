
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class Emp {
	
	@Id
	private String Id;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	private int Sal;
	private String Fname;
	private String Mname;
	private String Lname;
	private String email;
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Emp() {
		super();
	}
	public Emp(String id, int sal, String fname, String mname, String lname, String email) {
		super();
		Id = id;
		Sal = sal;
		Fname = fname;
		Mname = mname;
		Lname = lname;
		this.email = email;
	}
	

}