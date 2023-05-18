package com.Abstract;

abstract class Card
{
	abstract void makecard();
}

class BirthCard extends Card
{
	void makecard()
	{
		System.out.println("Hii this is Anniversary invite....");
	}
}

public class AbstractDemo 
{

	public static void main(String[] args) 
	{
		
		Card c=new BirthCard();
		c.makecard();
		
	}
	
	
}
