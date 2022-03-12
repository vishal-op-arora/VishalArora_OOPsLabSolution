package EmailApplication;

import java.util.Scanner;

public class Employee extends CredentialService {
	
	Employee(String firstname, String lastName){
		super.setFirstName(firstname);
		super.setLastName(lastName);
		super.setDepartment(employeeDepartment());
	}
	
	protected String employeeDepartment() {
		String department = null;
		System.out.println("Please enter the department from the following \n"
				+ "1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resource \n"
				+ "4. Legal");
		
		Scanner scan = new Scanner(System.in);
		int departmentID = scan.nextInt();
		
		switch (departmentID) {
		case 1:
			department = "Technical";
			break;
		case 2:
			department = "Admin";
			break;		
		case 3:
			department = "HumanResource";
			break;
		case 4:
			department = "Legal";
			break;
		default:
			System.out.println("Incorrect information");
			break;
		}
		return department;
	}
	
}
