package com.algo;

import java.util.Scanner;

public class Gross_salary_calculation {

	public static void main(String[] args) 
	{
		double basic, da, hra, gross;
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a basic salary: ");
		
		basic=sc.nextDouble();
		
		if(basic <= 10000)
		{
			da = basic * 0.8;
			hra= basic * 0.2;
		}
		else if(basic <= 20000)
		{
			da = basic * 0.90;
			hra= basic * 0.25;
		}
		else
		{
			da = basic * 0.95;
			hra= basic * 0.30;
		}

		gross = basic + da + hra;
		System.out.println("Gross salary = " + gross);
	}

}
