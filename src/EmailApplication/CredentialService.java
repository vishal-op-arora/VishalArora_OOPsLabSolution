package EmailApplication;


public abstract class CredentialService {
	
	protected String firstName;
	protected String lastName;
	protected String department;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/*public String getFirstName() {
		return this.firstName;
	}*/
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/*public String getLastName() {
		return this.lastName;
	}*/
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	protected String generatePassword() {
		
		return "";
	}
	
	protected String generateEmailAddress() {
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + ".abc.com";
	}
	
	public void showCredentials() {
		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email    --->  " + generateEmailAddress());
		System.out.println("Password ---> " + generatePassword());
	}
}
