package com.Abstract;

abstract class Cards
{
	int price=100;
	static String name;
	final String size="4*4";
	
	abstract void makecard();
	
	public void checkprice()
	{
		System.out.println("Price per card= "+100);
	}
	
}

class Birthdaycards extends Cards
{
	@Override
	void makecard()
	{
		System.out.println("hi this birthady invite..");
	}
}

public class AbstactDemo1 
{
		
	public static void main(String[] args) {
		
		Cards c=new Birthdaycards();
		c.makecard();
		c.checkprice();
		
	}
	
}
