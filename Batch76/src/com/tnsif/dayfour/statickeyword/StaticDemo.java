package com.tnsif.dayfour.statickeyword;

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Akshata",65000);
		Employee e2 = new Employee(102,"Arati",75000);
		
		e1.name = "Akashta Khamitkar";
		e1.companayName = "TNSIF";
		e2.companayName = "Accenture";
		System.out.println(e1);
		System.out.println(e2);
	}

}
