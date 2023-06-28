package com.lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Customer 
{
	int c_code;
	String c_name;
	String c_add;
	float c_balance;
	
	public Customer(int c_code, String c_name, String c_add, float c_balance) {
		super();
		this.c_code = c_code;
		this.c_name = c_name;
		this.c_add = c_add;
		this.c_balance = c_balance;
	}
	
	public Customer( String c_name, String c_add, float c_balance) {
		super();
		this.c_name = c_name;
		this.c_add = c_add;
		this.c_balance = c_balance;
	}

	@Override
	public String toString() {
		return " c_name=" + c_name + ", c_add=" + c_add + ", c_balance=" + c_balance ;
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Customer> hs=new HashMap<>();
		ArrayList<Customer> al=new ArrayList<>();
		System.out.println("Enter Customer Details");
		for(int i=1; i<=3 ; i++)
		{
			System.out.println("Enter customer id");
			int cid=sc.nextInt();
			System.out.println("Enter customer name");
			String cname=sc.next();
			System.out.println("Enter customer city");
			String ccity=sc.next();
			System.out.println("Enter customer balance");
			float cbalance=sc.nextFloat();
			
			al.add(new Customer(cid,cname,ccity,cbalance));
		}
		
		Iterator<Customer> itr = al.iterator();
		while(itr.hasNext())
		{
			//int Coustomer_id = itr.next().c_code;
			Customer c=itr.next();
			hs.put(c.c_code, new Customer(c.c_name,c.c_add,c.c_balance));
			 
		}
		
		System.out.println(al);
		System.out.println("...............................");
		
		for(Map.Entry<Integer, Customer> h : hs.entrySet())
		{
			System.out.println(h.getKey()+" "+h.getValue());
		}
		
	}
	
}
