package com.greatlearning.pg.client;

import java.util.Scanner;

import com.greatlearning.pg.model.Employee;
import com.greatlearning.pg.service.CredentialService;

public class Main {	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Employee First Name :: ");
		String firstName = scan.next();
		
		System.out.print("Enter Employee Last Name :: ");
		String lastName = scan.next();
		
		int selectDepartment = 0;
		System.out.println("Please enter the department from the following \n"
				+ "1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal");
		try {
			selectDepartment = scan.nextInt();
		} catch(RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
		scan.close();
		
		Employee employee = new Employee(firstName, lastName);
		employee.setDepartment(selectDepartment);
		employee.setPassword();
		
		CredentialService.showCredentials(employee);
	}
}
