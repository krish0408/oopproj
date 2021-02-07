package com;

import java.time.LocalDate;

public class ContractEmployee extends Employee{
	
	LocalDate contractStartDate;
	LocalDate contractEndDate;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int id, String name, String email, String phone, GenderType gender, LocalDate dob,LocalDate contractStartDate, LocalDate contractEndDate) {
		super(id, name, email, phone, gender, dob);
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("ContractEmployee : calculateSalary()");
	}
}
