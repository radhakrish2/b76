package com.tnsif.daysix.abstractdemo;

public class AbstractDemo {

	public static void main(String[] args) {
		
//		Account account = new SavingAccount("1234567", 1000, 12.5);
//		account.displayBalance();
//		account.widthdraw(500);
		
		Account account = new CurrentAccount("987654", 5000, 10000);
		account.displayBalance();
		account.widthdraw(20000);

	}

}
