package com.lab;

import java.util.Scanner;

public class Bookinfo 
{
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Book Name");
				String bname=sc.nextLine();
				Book_1 b=new Book_1();
				b.setBookid(333);
				b.setBookname("Harry Potter");
				b.setBookprice(500);
				
				
				 int disprice;
				if(bname.equals(b.getBookname()))
				{	
				     disprice= ((5*500)/100);
				     int Price=b.getPrice()-disprice;
				System.out.println("Book ID: "+b.getBookid()+"\nBook Name: "+b.getBookname()+"\nBook Price: "+Price);

				}
				else
				{
					System.out.println("Book ID: "+b.getBookid()+"\nBook Name: "+b.getBookname()+"\nBook Price: "+b.getPrice());

				}
	
				
			}
}
