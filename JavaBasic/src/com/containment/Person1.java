package com.containment;

class Address1
{
	int pin;
	String city1;
	
	public Address1(int pin, String city1)
	{
		this.pin=pin;
		this.city1=city1;
	}
	
	public String toString() {
		return pin+" "+city1;
	}
}
public class Person1 
{

	int perid;
	String pername;
	Address1 adrs;
	
	public Person1(int perid, String pername, Address1 adrs )
	{
		this.perid=perid;
		this.pername=pername;
		this.adrs=adrs;
	}
	
	public String toString()
	{
		return perid+" "+pername+" "+adrs;
	}
	public static void main(String[] args) 
	{
		Person1 p1=new Person1(237,"Vj",new Address1(415002,"Satara"));
		
		System.out.println(p1.perid);
		System.out.println(p1.pername);
		System.out.println(p1.adrs);
		
	}
}
