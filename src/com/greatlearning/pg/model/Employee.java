package com.greatlearning.pg.model;

import com.greatlearning.pg.service.CredentialService;
import com.greatlearning.pg.service.Department;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	
	// Employee First Name
	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	// Employee Last Name
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Employee Password
	public String getPassword() {
		return password;
	}

	public void setPassword() {
		this.password = CredentialService.generatePassword();
	}

	// Employee Department
	public String getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		
		switch (department) {
		case 1:
			this.department = Department.TECHNICAL.getDepartment();
			break;
		
		case 2:
			this.department = Department.ADMIN.getDepartment();
			break;
		
		case 3:
			this.department = Department.HR.getDepartment();
			break;
		
		case 4:
			this.department = Department.LEGAL.getDepartment();
			break;

		default:
			break;
		}
	}

	// Constructor
	public Employee(String firstname, String lastName){
		this.firstName = firstname;
		this.lastName = lastName;
	}
}
