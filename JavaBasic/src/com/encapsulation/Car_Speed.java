package com.encapsulation;

public class Car_Speed 
{
		
		public static void main(String[] args) {
			
			Car c=new Car();
			c.setCname("BMW");
			c.setModel_no("X4");
			c.setSlimit(70);
			
			
			System.out.println("Car Name: "+c.getCname()+"\nModel No: "+c.getModel_no()+"\nCar Speed : "+c.getSlimit());
		}
	
	
}
