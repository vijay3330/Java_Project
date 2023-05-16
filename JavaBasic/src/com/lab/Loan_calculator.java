package com.lab;

public class Loan_calculator 
{
		
	public void loan(int P )
	{	
		int single= (int) ((P*7*3)/100);
		int loan_amount= P-single;
		System.out.println(loan_amount);
	}
	
	public void loan(int P1, int days)
	{
		if(days<365)
		{
			int single= (int) ((P1*7*days)/(365*100));
			System.out.println("total intrest amount: "+single);
			
		}
		else
		{
			int single= (int) ((P1*14*days)/(365*100));
			System.out.println("total intrest amount: "+single);
		
		}
	}
	
	
	public static void main(String[] args) 
	{
		Loan_calculator l=new Loan_calculator();
		l.loan(50000);
		l.loan(50000, 182);
		
	}
}
