package com.algo;

public class Discounted_amount 
{
	//calculate Discounted amount from price (Note disc 15% of price)
	public static void main(String[] args)
	{
		int MRP=1500,discount=25,discounted_price=0, selling_price;
		
		discounted_price= (MRP * discount) / 100;
		
		System.out.println("discounted price:"+ discounted_price );
		selling_price= MRP - discounted_price;
		
		System.out.println("selling price:"+selling_price);
		
		

	}

}
