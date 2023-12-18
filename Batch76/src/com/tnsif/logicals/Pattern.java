package com.tnsif.logicals;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Program to demonstrate star pattern
public class Pattern
{
	public static void main(String[] arg) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n-j+1;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
}
