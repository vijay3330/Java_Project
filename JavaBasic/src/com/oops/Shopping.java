package com.oops;

public class Shopping 
{
	int cust_Id;
	int qty;
	String product_name;
	double price;
	double Amount_topay;
	
	public void shopping_details(int id, int qutity, String prod_name, double bill )
	{		cust_Id=id;
			qty=qutity;
			product_name=prod_name;
			price=bill;
			
	}		
	
	public void bill_amount()
	{
		System.out.println("Customer ID: "+cust_Id+"\n"+"Quntity :"+qty+"\n"+"product name: "+product_name+"\n"+"product price: "+price);

		
		
	}
	
	public void Shopping_details_with_bill()
	{
		
		if(qty>0)
		{	
			Amount_topay = qty*price;
		
			System.out.println("Total Bill : "+Amount_topay);
		}
		else
		{
			System.out.println("Error");
		}
		
		
	}
	public static void main(String[] args)
	{
		Shopping s=new Shopping();
		s.shopping_details(123, 0, "Colgate", 30);
		s.bill_amount();
		s.Shopping_details_with_bill();
	}
}
