package com.oops;

import java.util.Scanner;

public class Booking {

	
	
	public static void main(String[] args) {
		Movie m=new Movie();
		int price=m.getPrice();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.next();
		System.out.println("Do you have coupan if yes then press 'y' or 'Y' otherwise 'n' or 'N'");
		char ch=sc.next().charAt(0);
		int coupan;
		if(ch=='y' || ch=='Y')
		{
			System.out.println("Enter coupan code");
			 coupan=sc.nextInt();
			 if(coupan==100)
			 {	
				 System.out.println("Ticket Price: "+ " "+ price +" Rs-/");
				 int discount=(price*15)/100;
				 int discp=price-discount;
				 System.out.println("Your 15% discount price :" +" "+ discp+" Rs-/");
				 System.out.println("Enjoy your show...");
			 }
			 if(coupan==200)
			 {
				
				 System.out.println("Ticket Price: "+ " "+ price+" Rs-/");
				 int discount=(price*10)/100;
				 int discp=price-discount;
				 System.out.println("Your 10% discount price :" +" "+ discp+" Rs-/");
				 System.out.println("Enjoy your show...");
			 }
			 
		}
		else
		{
			System.out.println("Ticket Price: "+ " "+ price+" Rs-/");
			 System.out.println("Enjoy your show...");
		}
			

	}

}
