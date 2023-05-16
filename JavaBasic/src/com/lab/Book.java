package com.lab;

import java.util.Scanner;

public class Book 
{
		int id;
		String name;
		int price;
		String aname;
		
		public Book(int bid,String bname,int bprice,String aut_name)
		{
			id=bid;
			name=bname;
			price=bprice;
			aname=aut_name;
		}
		
		public void show()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the author name");
			String aut_name=sc.nextLine();
			if(aname.equals(aut_name))
			{
				price=price-50;
				System.out.println("Total price : "+price  );
			}
			else
			{
				System.out.println("Total price : "+price  );
			}
			
		}
		
		public static void main(String[] args) 
		{
			Book b=new Book(101,"Revolution 2020",300,"Chetan Bhagat");
			b.show();
		}
}
