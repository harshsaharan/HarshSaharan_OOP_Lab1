package com.harshsaharan.main;
import java.util.*;
import com.harshsaharan.model.Employee;
import com.harshsaharan.services.CredentialService;
public class Driver {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[] ){
		System.out.println("hi");
		Employee employee = new Employee("Harsh","Saharan");
		displayMenu();
		int option = scanner.nextInt();
		System.out.println(option);
		CredentialService credentialService = new CredentialService();
		String[] departments = {"tech","admin","hr","legal"};
		String emailAddress = credentialService.GenerateEmailAddress(employee,departments[option-1]);
		employee.setEmail(emailAddress);
		String password = credentialService.generatePassword();
		employee.setPassword(password);
		credentialService.showCredentials(employee);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Please Enter the Department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
	
	

	
}
