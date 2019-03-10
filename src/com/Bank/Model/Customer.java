package com.Bank.Model;

import java.io.Serializable;

public class Customer implements Serializable{
	private String customerName,address;
	private long mobileNo,accountNo,aadharNo;
 public String getcustomerName() {
	 return customerName;
 }
 public void setcustomerName(String customerName) {
	 this.customerName=customerName;
 }
 public String getaddress() {
	 return address;
 }
 public void setaddress(String address) {
	 this.address=address;
 }
 public long getmobileNo() {
	 return mobileNo;
 }
 public void setmobileNo(long mobileNo) {
	 this.mobileNo=mobileNo;
 }
 public long getaccountNo() {
	 return accountNo;
 }
 public void setaccountNo(long accountNo) {
	 this.accountNo=accountNo;
 }
 public long getaadharNo() {
	 return aadharNo;
 }
 public void setaadharNo(long aadharNo) {
	 this.aadharNo=aadharNo;
 }
}
