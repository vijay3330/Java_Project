package com.lab;

public class Bankdemo 
{
		public static void main(String[] args) {
			
			Bank b=new Bank();
			
			System.out.println("Name Of Bank: "+ b.getb_name("SBI"));
		//	System.out.println("Locker ID: "+b.get_locker_id(333));
			System.out.println("Rate Of Intrest: "+b.get_rateof_intrest(7.5f));
			System.out.println("Branch Name: "+b.get_branch_name("Satara"));
		}
}
