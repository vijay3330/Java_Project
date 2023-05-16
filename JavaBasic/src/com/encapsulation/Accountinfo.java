package com.encapsulation;

public class Accountinfo 
{
		
		public static void main(String [] args)
		{
			BankAccount b=new BankAccount();
			b.setActno(3330);
			b.setActtype("Saving");
			b.setBalance(50000);
			
			System.out.println("Bank Account No: "+b.getActno()+"\nAccount Type: "+b.getActtype()+"\nAccount Balance: "+b.getBalance());
		}
		
}
