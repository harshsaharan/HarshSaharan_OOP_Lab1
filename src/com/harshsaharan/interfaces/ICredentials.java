package com.harshsaharan.interfaces;

import com.harshsaharan.model.Employee;

public interface ICredentials {

	public String GenerateEmailAddress(Employee employee , String department);
	public String generatePassword();
	public void  showCredentials(Employee employee);
	
}
