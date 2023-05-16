package com.inheritanceDemo;

class Animal
{
	String animalname;
}

class Lion extends Animal
{
	public void showLion()
	{
		animalname="Lion";
		System.out.println(animalname+" is a King Of jungle");
	}
}

public class Single_level3
{

	public static void main(String[] args) {
		
		Lion l=new Lion();
		l.showLion();
		
	}
	
}
