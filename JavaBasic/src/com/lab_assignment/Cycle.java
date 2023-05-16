package com.lab_assignment;

public class Cycle 
{
		int accountno;
		int no_of_wheels;
		
		Cycle()
		{
			System.out.println("I am a default constructor");
		}
		
		public Cycle(int accountno, int no_of_wheels)
		{
			this();
			System.out.println("I am another constructor");
		}
		
		public static void main(String[] args) {
			
			Cycle c=new Cycle();
			
			Cycle c1=new Cycle(10,2);
			
			
		}
}
