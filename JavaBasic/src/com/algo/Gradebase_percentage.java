package com.algo;

public class Gradebase_percentage {

	public static void main(String[] args) 
	{
			float percentage = 34.00f;
			
			if(percentage > 90)
			{
				System.out.println("Grade: A++");
			}
			else if(percentage > 80)
			{
				System.out.println("Grade: A+");
			}
			else if(percentage > 70)
			{
				System.out.println("Grade: A");
			}
			else if(percentage > 60)
			{
				System.out.println("Grade: B");
			}
			else if(percentage > 50)
			{
				System.out.println("Grade: C");
			}
			else if(percentage > 35)
			{
				System.out.println("Grade: D ");
			}
			else
			{
				System.out.println("Fail...");
			}

	}

}
