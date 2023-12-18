package com.tnsif.daythree.constructor;

public class Car 
{
	private int carNo;
	private String name;
	private String color;
	
	//Paremeterless constructor
	public	Car()
		{
			carNo=0;
			name=null;
			color=null;
		}
		//Paremeterized Constructor
	public	Car(int no, String carName, String carColor)
		{
			carNo=no;
			name=carName;
			color=carColor;
		}
		
		public int getCarNo()
		{
			return carNo;
		}
		
		public String getCarName()
		{
			return name;
		}
	
		public String getColor()
		{
			return color;
		}
}
