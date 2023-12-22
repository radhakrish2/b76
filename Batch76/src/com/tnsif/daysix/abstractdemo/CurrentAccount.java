package com.tnsif.daysix.abstractdemo;

public class CurrentAccount extends Account
{
	private double overdraftLimit;

	public CurrentAccount(String accNo, double balance, double overdraftLimit) {
		super(accNo, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
		
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void widthdraw(double amount) {
		
		if(getBalance() - amount >= -overdraftLimit)
		{
			setBalance(getBalance()-amount);
			System.out.println("Widthdraw Successful");
			displayBalance();
		}
		
		else
		{
			System.out.println("Exceeded overdraft limit");
		}
		
		
	}
	
	
	
	

}
