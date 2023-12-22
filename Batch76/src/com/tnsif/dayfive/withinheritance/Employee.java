package com.tnsif.dayfive.withinheritance;

public class Employee  {
	private String name;
	private int employeeId;
	private double salary;

	public Employee()
	{
		
	}
	
	public Employee(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	// Getter methods
	protected String getName() {
		return name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	private void display()
	{
		System.out.println("This is Employee class");
	}
	
}