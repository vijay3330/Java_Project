package com.algo;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args)
	{
		double unit, bill, total_electricity_bill, Adiiadditional_surcharge;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter Units : ");
		
		unit=sc.nextDouble();
		
		if(unit <= 50)
		{
			total_electricity_bill = unit * 0.50;
		}
		else if(unit <= 150)
		{
			total_electricity_bill = unit * 0.75;
		}
		else if(unit <= 250)
		{
			total_electricity_bill = unit * 1.20;
		}
		else
		{
			bill = unit * 1.50;
			Adiiadditional_surcharge = ((20 / bill) * 100) ;
			total_electricity_bill =  bill + Adiiadditional_surcharge;
		}
		
		System.out.println("Total electricity bill = " + total_electricity_bill);

	}

}
