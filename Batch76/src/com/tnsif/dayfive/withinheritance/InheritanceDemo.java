package com.tnsif.dayfive.withinheritance;

import com.tnsif.dayfive.withinheritance2.PermanentEmployee;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		PermanentEmployee obj = new PermanentEmployee("Sachin", 101, 65000, "3 CL");
		System.out.println(obj);
		obj.display();
	
	}

}
