package com.polymorphism;

class Vehicals
{
//	public Animal show()
//	{
////		Animal a=new Animal();
////		
////		return a;
//		return new Animal();
//	}
	
	public Number getNum()
	{
		System.out.println("hii");
		return 67;
	}
	
	
}

class car extends Vehicals
{
//	@Override
//	public Dog show()
//	{
//		System.out.println("car");
//		return new Dog();
//	}
	
	public Double getNum()
	{
		System.out.println("abcd");
		return 12.67;
	}
}


public class CovarientDemo 
{
	// Covarient is used when we have same methodnames with different return types in parent and child at that time we can perform overriding this feature introduce from java 5  
	public static void main(String[] args) {
		
		car c=new car();
		c.getNum();
	
		
	}
	
	
	
}
