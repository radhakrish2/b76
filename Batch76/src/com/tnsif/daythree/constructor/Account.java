package com.tnsif.daythree.constructor;
import java.util.Scanner;
public class Account {
	
	private int accNo;
	private String name;
	private double balane;
	private int pin;
	
	//Default Constructor
	public Account() {
		
	}

	//Parameterized Constructor
	public Account(int accNo, String name, double balane, int pin) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balane = balane;
		this.pin = pin;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalane() {
		System.out.println("Enter your pin");
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		if(p==pin)
			return balane;
		
		System.out.println("your pin is invalid");
		return 0;
	}

	public void setBalane(double balane) {
		this.balane = balane;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
	
	
}
