package com.algo;

public class Percentage {

	// find the percentage of 5 subject marks which are out of 100
	public static void main(String[] args)
	{
		int S1=60, S2=70, S3=80, S4=50, S5=90;
		float marks, percentage;
		
		marks= S1+S2+S3+S4+S5;
		
		percentage= (marks / 500) * 100;
		
		System.out.println(percentage);
		
	

	}

}
