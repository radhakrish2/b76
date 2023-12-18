package com.tnsif.daythree.constructor;

public class CarDemo {

	public static void main(String[] args) {
		
		Car c1 = new Car(101,"BMW","RED");
		Car c2 = new Car(102,"Audi","BLUE");
		
		System.out.println(c1.getCarNo());
		System.out.println(c1.getCarName());
		System.out.println(c1.getColor());
		System.out.println("--------------------");
		System.out.println(c2.getCarNo());
		System.out.println(c2.getCarName());
		System.out.println(c2.getColor());

	}

}
