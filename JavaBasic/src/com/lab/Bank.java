package com.lab;

public class Bank 
{
	public String b_name;
	private int locker_id;
	protected float rateof_intrest;
	String branch_name;
	
//	public Bank(String b_name,int locker_id,float rateof_intrest,String branch_name)
//	{
//		this.b_name=b_name;
//		this.locker_id=locker_id;
//		this.rateof_intrest=rateof_intrest;
//		this.branch_name=branch_name;
//	}
	
	public String getb_name(String b_name)
	{
		return b_name;
	}
	
	private int get_locker_id(int locker_id)
	{
		return locker_id;
	}
	
	String get_branch_name(String branch_name)
	{
		return branch_name;
	}
	
	protected float get_rateof_intrest(float rateof_intrest)
	{
		return rateof_intrest;
	}
	
	
	public static void main(String[] args) 
	{
		Bank b=new Bank();
	
		System.out.println("Name Of Bank: "+ b.getb_name("SBI"));
		System.out.println("Locker ID: "+b.get_locker_id(333));
		System.out.println("Rate Of Intrest: "+b.get_rateof_intrest(7.5f));
		System.out.println("Branch Name: "+b.get_branch_name("Satara"));
		
	}
	
	
}
