package com.cg.bank.BankApplications.service;

import com.cg.bank.BankApplications.dao.TransactionDao;
import com.cg.bank.BankApplications.dao.TransactionDaoImpl;

public class TransactionServiceImpl implements TransactionService{
	TransactionDao transactionDao=new TransactionDaoImpl();


	public double withdraw(int withdrawAmount) {
		return transactionDao.withdraw(withdrawAmount);
	}

	public double deposit(int depositAmount) {
		return transactionDao.deposit(depositAmount);
	}

	public int balance() {
		return transactionDao.balance();
	}

}
