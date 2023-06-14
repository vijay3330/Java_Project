package com.lab;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import com.collection.Employee;

public class Item
{
		int id;
		String name;
		float price;
		
		public Item(int id, String name, float price)
		{
			this.id=id;
			this.name=name;
			this.price=price;
		}

		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
		
		
		public static void itemPrice(ArrayList<Item> al)
		{
//			ListIterator<Item> itr=al.listIterator();
//			while(itr.hasNext())
//			{
//				Item ob= itr.next();
//				if(ob.price == 150)
//				{
//					System.out.println(ob);
//				}
//			}
			
			for(int j=0;j<al.size();j++)
			{
				Item a = al.get(j);
				for(int k=j+1;k<al.size();k++)
				{	
					Item b = al.get(k);
					if(a.price == b.price)
					{
						System.out.println(a);
						System.out.println(b);
					}
				}
			}
			
		}
		
		
		public static void main(String[] args) 
		{
			ArrayList<Item> al=new ArrayList<>();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter no of items");
			int size=sc.nextInt();
			for(int i=0; i< size;i++)
			{
				System.out.println("Enter item id");
				int id=sc.nextInt();
				System.out.println("Enter item name");
				String name=sc.next();
				System.out.println("Enter iten price");
				float price=sc.nextInt();
				
				al.add(new Item(id,name, price));
				
			}
			
			for(Item ii:al)
			{
				System.out.println(ii);
			}
			
			System.out.println("----------------------------------");
			
			
			itemPrice(al);
			
			
		}
		
		
}
