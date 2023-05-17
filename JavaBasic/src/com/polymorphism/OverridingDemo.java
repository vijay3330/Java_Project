package com.polymorphism;

class Animal
{
	 public void eat()
	{
		System.out.println("Animals Are eating....");
	}
}
class Dog extends Animal
{
	@Override
	public void eat()
	{
		super.eat();
		System.out.println("Dog is eating dog food..");
		//super.eat();
	}
}

public class OverridingDemo 
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.eat();
	}
}
