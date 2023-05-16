package com.basicprog;

import com.lab.Bank;

public class Bankdemo2 extends Bank
{
				public static void main(String[] args) 
				{
					
//					Bank b1=new Bank("SBI",333,7.5f,"Satara");
//					
//					System.out.println("Name Of Bank: "+ b1.getb_name());
//					System.out.println("Locker ID: "+b1.get_locker_id());
//					System.out.println("Rate Of Intrest: "+b1.get_rateof_intrest());
//					System.out.println("Branch Name: "+b1.get_branch_name());
					
					Bankdemo2 b=new Bankdemo2();
					
					
					System.out.println("Rate Of Intrest: "+b.get_rateof_intrest(7.5f));
					
					
					
				}
}
