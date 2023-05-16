package com.inheritanceDemo;


class Laptop
{
	String Ramsize="8GB";
}

class Dell extends Laptop
{
	public void show()
	{
		System.out.println(Ramsize);
	}
	public void DellDetails()
	{
		System.out.println("This is the Dell 24 inch laptop");
	}
}

public class Single_level 
{
		public static void main(String[] args) {
			
			Dell d=new Dell();
			d.show();
			d.DellDetails();
			
		}
}
