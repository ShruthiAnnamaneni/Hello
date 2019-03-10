package com.Bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Bank.Model.Customer;

public class Registration {
	static ArrayList<Customer> arrayList=new ArrayList<>();
	static void setDetails(){
		Scanner input=new Scanner(System.in);
		Customer customer=new Customer(); 
		System.out.println("Enter customer name : ");
		customer.setcustomerName(input.next());
		System.out.println("Address :");
		customer.setaddress(input.next());
		System.out.println("Enter mobile no :");
		customer.setmobileNo(input.nextLong());
		System.out.println("Enter aadhar no :");
		customer.setaadharNo(input.nextLong());
		System.out.println("Enter account no :");
		customer.setaccountNo(input.nextLong());
		arrayList.add(customer);
		
	}
	private static void serialize() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("F:\\shruthi\\serializedObjectFile.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(arrayList);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static List  deserialize() {
		Customer cust=null;
		try {
			FileInputStream fileInputStream = new FileInputStream("F:\\shruthi\\serializedObjectFile.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		    arrayList=(ArrayList<Customer>)objectInputStream.readObject();
		    }
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for(Customer myObject:arrayList) {
			System.out.println("customerName: "+myObject.getcustomerName()+"  Address: "+myObject.getaddress()+"	Mobile number: "+myObject.getmobileNo()+"	Aadhar Number: "+myObject.getaadharNo()+"  Account number:"+myObject.getaccountNo());
		  }
		return arrayList;
	}
	public void validation() {
		Scanner sc=new Scanner(System.in);
		Customer customer=new Customer();
		System.out.println("Enter the aadhar number");
	    customer.setaadharNo(sc.nextLong());
	    long newAadharNo=customer.getaadharNo();
	    if(newAadharNo==customer.getaadharNo()) {
	    	System.out.println("Customer already exist");
	    }
	    
	}
	public static void main(String args[]) {
		for(int i=0;i<3;i++) {
		setDetails();
		}
		serialize();
		deserialize();
		
	}

}
