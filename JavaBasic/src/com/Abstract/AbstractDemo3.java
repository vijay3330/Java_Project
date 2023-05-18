package com.Abstract;

abstract class Cardss
{
	Cardss(int x)
	{
		System.out.println("Cards..... "+x);
	}
	
	abstract void makecard();
}

class Birthdaycardss extends Cardss
{
	Birthdaycardss
	()
	{
		super(2000);
	}
	
	@Override
	void makecard()
	{
		System.out.println("Hiii this is a birthday invitation......");
	}
}


public class AbstractDemo3 
{
		
	public static void main(String[] args) {
		
		Cardss c=new Birthdaycardss();
		c.makecard();
		
	}
	
}
