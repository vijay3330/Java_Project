package com.twoDDemo;

public class TwoDDemo1 
{
		
	public void sumOfRow(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			for(int j=0; j<a[i].length; i++)
			{
				sum=sum+a[i][j];
				System.out.println(a[i][j]+" ");
			}
			System.out.print(" sum="+ sum);
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int a[][]= { {1,2,3}, {6,4,9}, {7,3,2} };
		
		TwoDDemo1 t=new TwoDDemo1();
		t.sumOfRow(a);
		
	}
}
