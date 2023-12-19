package com.tnsif.dayfour.statickeyword;

public class Employee 
{
	int empId;
	String name;
	double salary;
	static String companayName = "Capgemini";
	public Employee()
	{
		
	}
	
	public Employee(int empId, String name, double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		
	}
	
	public String toString()
	{
		return empId + " "+name + " " + salary +" "+companayName ;
	}
	
}
