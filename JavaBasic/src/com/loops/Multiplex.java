package com.loops;

import java.util.Scanner;

public class Multiplex 
{
		 public static void main(String[] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter pizza price");
			 int pizza=sc.nextInt();
			 System.out.println("enter puffs price");
			 int puffs=sc.nextInt();
			 System.out.println("enter coold drink price");
			 int cool_drink=sc.nextInt();
			 System.out.println("Do you want to buy");
			 char ch=sc.next().charAt(0);
			 int total_price=0;
			 
			 while(ch=='y' || ch=='Y')
			 {
				 System.out.println("Ether the qty for pizza");
				 int pizaqty=sc.nextInt();
				 System.out.println("Enter the qty for puffs");
				 int puffqty=sc.nextInt();
				 System.out.println("Enter the qty for cool drinks");
				 int cool_drinkqty=sc.nextInt();
				 
				 total_price=(pizza*pizaqty)+(puffs*puffqty)+(cool_drink*cool_drinkqty);
				 System.out.println("Bill Details"+"\n"+"No of pizzas: "+pizaqty+"\n"+"No of puffs: "+puffqty+"\n"+"No of cooldrinks: "+cool_drinkqty+"\n"+total_price+"\n"+"ENJOY THE SHOW!!!");
				 break;
			 }
			 
			 
			 
		 }
}
