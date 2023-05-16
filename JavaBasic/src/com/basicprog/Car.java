package com.basicprog;

import com.polymorphism.Vehical;

public class Car extends Vehical
{

	public static void main(String[] args) {
		
		Car c=new Car();
		c.wheels=4;
		System.out.println(c.wheels);
	}
	
}
