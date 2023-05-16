package com.inheritanceDemo;

class Vehical
{
	int wheels;
}

class Car extends Vehical
{

	public void show_Car()
	{   wheels=4;
		System.out.println("Car wheels= "+ wheels);
	}
}

class Truck extends Vehical
{

	public void show_Truck()
	{
		wheels=8;
		System.out.println("Truck wheels= "+ wheels);
	}
}


public class hierarchical
{
		public static void main(String [] args)
		{
			Car c=new Car();
			c.show_Car();
			
			Truck t=new Truck();
			t.show_Truck();
		}
}
