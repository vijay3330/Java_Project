package com.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Items
{
	
	int i_id;
	String i_name;
	int i_price;
	
	public Items(int i_id, String i_name, int i_price)
	{
		this.i_id=i_id;
		this.i_name=i_name;
		this.i_price=i_price;
	}

	@Override
	public String toString() {
		return "Item [i_id=" + i_id + ", i_name=" + i_name + ", i_price=" + i_price + "]";
	}
	
	
	
}



public class Supplier 
{
		int s_id;
		String s_name;
		Items i;
		
		public Supplier(int s_id, String s_name, Items items)
		{
			this.s_id=s_id;
			this.s_name=s_name;
			this.i=items;
		}

		@Override
		public String toString() {
			return "Supplier [s_id=" + s_id + ", s_name=" + s_name + ", i=" + i + "]";
		}
		
		
		
		
		public static void main(String[] args) 
		{
			ArrayList<Supplier> sp=new ArrayList<>();
			ArrayList<Items> Ie=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Supplier size");
			int size=sc.nextInt();
			
			for(int i=0 ; i<size; i++)
			{
				System.out.println("Enter supplier id");
				int s_id=sc.nextInt();
				System.out.println("Enter supplier name ");
				String s_name=sc.next();
				System.out.println("Enter the Item details");
				
				
				
				System.out.println("Enter Item id");
				int i_id=sc.nextInt();
				System.out.println("Enter Item name");
				String i_name=sc.next();
				System.out.println("Enter Item price");
				int i_price=sc.nextInt();
				
				sp.add(new Supplier(s_id,s_name,new Items(i_id,i_name,i_price)));
			}
			
			
			Iterator<Supplier> itr=sp.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("-----------------------------------------");
			
//			
//			Iterator<Supplier> itr2=sp.iterator();
//			while(itr2.hasNext())
//			{
//				if(itr2.next().i.price > 100)
//				{
//					System.out.println(itr2.next().s_name);
//				}
//			}
			
			for(Supplier ss:sp)
			{
				if(ss.i.i_price > 100)
				{
					System.out.println(ss.s_name);
				}
			}
		}
		
	
}
