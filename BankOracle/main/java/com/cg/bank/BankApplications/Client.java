package com.cg.bank.BankApplications;

import java.util.Scanner;

import com.cg.bank.BankApplications.bean.DetailsDTO;
import com.cg.bank.BankApplications.service.RegistrationService;
import com.cg.bank.BankApplications.service.RegistrationServiceImpl;
import com.cg.bank.BankApplications.service.TransactionService;
import com.cg.bank.BankApplications.service.TransactionServiceImpl;

public class Client {
	RegistrationService registrationService=new RegistrationServiceImpl();
	TransactionService transactionService=new TransactionServiceImpl();
	DetailsDTO details=new DetailsDTO();
	Scanner input=new Scanner(System.in);
	public void settingInput() {
		System.out.println("Enter first name:");
		details.setFirstName(input.next());
		System.out.println("Enter last name: ");
		details.setLastName(input.next());
		System.out.println("Enter email id: ");
		details.setEmailId(input.next());
		System.out.println("enter the password: ");
		details.setPassword(input.next());
		System.out.println("Enter pancard number: ");
		details.setPancardNo(input.next());
		System.out.println("Enter aadhar number: ");
		details.setAadharNo(input.next());
		System.out.println("Enter address: ");
		details.setAddress(input.next());
		System.out.println("Enter mobile number: ");
		details.setMobileNo(input.next());
		System.out.println("Enter balance: ");
		details.setBalance(input.nextDouble());
		//calling register() method with registrationService object
		details=registrationService.register(details);
		
	}
	public static void main(String args[]) {
		Client c=new Client();
		c.settingInput();
	}

}
