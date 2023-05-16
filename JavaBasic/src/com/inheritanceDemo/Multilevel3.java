package com.inheritanceDemo;

class Bike
{
	public void showVehicalype()
	{
		System.out.println("Bike");
	}
}

class Honda extends Bike
{
	public void showBrand()
	{
		System.out.println("Brand: Honda");
	}
}

class Shine extends Honda
{
	public void ShowBikename()
	{
		System.out.println("Honda Shine is a 110cc bike...");
	}
}

public class Multilevel3 
{
		public static void main(String[] args) {
			
			Shine s=new Shine();
			s.showVehicalype();
			s.showBrand();
			s.ShowBikename();
			
		}
}
