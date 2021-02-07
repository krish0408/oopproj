package com;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{
	
	LocalDate dateOfJoining;
	
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int id, String name, String email, String phone, GenderType gender, LocalDate dob,LocalDate dateOfJoining) {
		super(id, name, email, phone, gender, dob);
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("PermanentEmployee : calculateSalary()");	
	}
	
}
