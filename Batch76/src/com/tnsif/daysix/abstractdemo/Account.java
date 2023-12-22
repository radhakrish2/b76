package com.tnsif.daysix.abstractdemo;

public abstract class Account {

	private String accNo;
	private double balance;

	public Account(String accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void depsite(double amount) {
		balance += amount;
		System.out.println("Amount Deposited!");
		displayBalance();

	}

	
	
	public void displayBalance()
	{
		System.out.println(balance);
	}

	public abstract void widthdraw(double amount);

}
