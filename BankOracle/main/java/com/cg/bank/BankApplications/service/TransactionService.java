package com.cg.bank.BankApplications.service;

public interface TransactionService {
	public double withdraw(int withdrawAmount);
	public double deposit(int depositAmount);
	public int balance();
	
}
