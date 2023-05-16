package com.inheritanceDemo;

class Country 
{
	String countryname;
}

class State extends Country
{	
	String state;
	public void Details()
	{
		countryname="india";
	}
	public void showDetails()
	{
		System.out.println(countryname+" is a country");
	}
}

class City extends State
{
	String city="SATARA";
	public void allDetails()
	{
	 countryname="india";
	 state="mharashtra";
	 System.out.println(city+" is a city of "+state+" state and maharashtra is a state of "+countryname);
	
	}
	
}

public class Multilevel1 
{
	public static void main(String[] args) {
		
	
		City c=new City();
		c.allDetails();
		
		
	}
				
}
