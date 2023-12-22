package com.tnsif.daysix.abstractdemo;

public class SavingAccount extends Account {
	
	private double interestRate;

	public SavingAccount(String accNo, double balance, double interestRate) {
		super(accNo, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void widthdraw(double amount) {

			if(getBalance() - amount >=0)
			{
				setBalance(getBalance()-amount);
				System.out.println("Widthdraw successfull!");
				displayBalance();
			}
		
	}
	
	
		
}
