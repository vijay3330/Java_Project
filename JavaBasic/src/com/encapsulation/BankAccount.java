package com.encapsulation;

public class BankAccount 
{

		private int actno;
		private String acttype;
		private int balance;
		
		public void setActno(int actno)
		{
			this.actno=actno;
		}
		
		public void setActtype(String acttype)
		{
			this.acttype=acttype;
		}
		
		public void setBalance(int balance)
		{
			if(balance <= 5000)
			{
				System.out.println("insufficient balance");
			}
			else {
				this.balance=balance;
			}
			
		}
		
		
		public int getActno()
		{
			return actno;
		}
		
		public String getActtype()
		{
			return acttype;
		}
		
		public int getBalance()
		{
			return balance;
		}
	
	
}
