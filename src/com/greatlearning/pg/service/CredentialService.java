package com.greatlearning.pg.service;

import java.util.Random;

import com.greatlearning.pg.model.Employee;

public abstract class CredentialService {
	
	protected static String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase().replaceAll("\\s", "") + ".abc.com";
	}
	
	public static String generatePassword() {
		
		String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerChars = "abcdefghijklmnopqrstuvwxyz";
		String numChars = "1234567890";
		String specialChars = "!@#$%^&*()_~`{}[]:;'<>?/.,\"";
		
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		
		/*
		 * Considering the password length is 8
		 * Which contain two uppercase chars, two lowercase chars, two numbers and two special chars
		 */
		for(int i=0; i< 8 ; i++) {
			int randomNumber = 0;
			if( 0 <= i && i <= 1) {
				randomNumber = random.nextInt(upperChars.length());
				sb.append(upperChars.charAt(randomNumber));
			}
			if( 2 <= i && i <= 3) {
				randomNumber = random.nextInt(lowerChars.length());
				sb.append(lowerChars.charAt(randomNumber));
			}
			
			if( 4 <= i && i <= 5) {
				randomNumber = random.nextInt(numChars.length());
				sb.append(numChars.charAt(randomNumber));
			}
			if( 6 <= i && i <= 7) {
				randomNumber = random.nextInt(specialChars.length());
				sb.append(specialChars.charAt(randomNumber));
			}
		}
		return shuffleStringChars(sb);
	}
	
	
	public static final void showCredentials(Employee employee) {
		System.out.println();
		System.out.println("Dear " + employee.getFirstname() + " your generated credentials are as follows");
		System.out.println("Email    --->  " + generateEmailAddress(employee.getFirstname(), employee.getLastName(), employee.getDepartment()));
		System.out.println("Password --->  " + employee.getPassword());
	}	
	
	
	public static String shuffleStringChars(StringBuilder inputString){
		StringBuilder outputString = new StringBuilder();       
		Random random = new Random();
		
		while(inputString.length() != 0 ){
		    int randPicker = random.nextInt(inputString.length());
		    outputString.append(inputString.charAt(randPicker));
		    inputString.deleteCharAt(randPicker);
		}
		return outputString.toString();
    }
}
