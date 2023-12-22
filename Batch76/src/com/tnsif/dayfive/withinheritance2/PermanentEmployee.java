package com.tnsif.dayfive.withinheritance2;

import com.tnsif.dayfive.withinheritance.Employee;

public class PermanentEmployee extends Employee {
	
	private String benefits;

	public PermanentEmployee(String name, int employeeId, double salary, String benefits) {
		
		super(name,employeeId,salary);
		
		this.benefits = benefits;
	}

	

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	
	@Override
	public String toString()
	{
		return getName() + "\n" + getEmployeeId()  + "\n"  + getSalary() + "\n" + getBenefits();
	}
	

	public void display()
	{
		System.out.println("This is PermentEmployee Class");
	}
	
	
	
	
	
	
}