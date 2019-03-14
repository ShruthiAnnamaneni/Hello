package com.cg.bank.BankApplications.dao;

public interface TransactionDao {
	public double withdraw(int withdrawAmount);
	public double deposit(int depositAmount);
	public int balance();
}
