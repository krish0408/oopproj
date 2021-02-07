package com;

import java.time.LocalDate;

abstract public class Employee {
	
	int id;
	String name;
	String email;
	String phone;
	GenderType gender;
	LocalDate dob;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String email, String phone, GenderType gender, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
	}
	
	abstract public void calculateSalary();
	
	public void getDetails() {
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		System.out.println("Email: "+email);
	}

}
