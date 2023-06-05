package com.harshsaharan.services;

import com.harshsaharan.interfaces.ICredentials;
import com.harshsaharan.model.Employee;
import java.util.Random;


public class CredentialService implements ICredentials{

	@Override
	public String GenerateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		String emailAddress = employee.getFirstName()+employee.getLastName()+"@"+department+".web.com";
		return emailAddress.toLowerCase();
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialCharacter = "!@#$%^&*_+-<>?./=";
		String password ="";
		String values = capitalLetters + smallLetter + number + specialCharacter ;
		Random random = new Random();
		String capitalchar = String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
		String numberchar = String.valueOf(number.charAt(random.nextInt(number.length())));
		for(int i=0;i<6;i++) {
			password+=String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		return capitalchar + password + numberchar;
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Welcome " + employee.getFirstName() + ",");
		System.out.println("Email: " + employee.getEmail());
		System.out.println("Password: " + employee.getPassword());
		
	}

	
}
