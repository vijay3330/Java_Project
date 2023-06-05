package com.ArrayProject;

import java.util.Arrays;

public class Test {
	
	
	public   int[] sort(int a[])
	{
		Arrays.sort(a);
		return a;
	}

	
	public void show(String ...city)
	{
		
		
	}
	public static  void add(int a[][],int b[][],int sum[][])
	{
		
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
	}
	public static void main(String[] args) {
	int arr[]= {5,4,23,1};
	Test t=new Test();
	System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(t.sort(arr)));
		
		t.show("pune");
		t.show("mumbai","pune","Goa");
		
		int a[][]= {{1,2,3},{4,3,1},{7,5,2}};
		
		int b[][]= {{8,4,2},{1,1,1},{1,1,1}};
		
		int sum[][]=new int[a.length][b.length];
		add(a,b,sum);

	}

}
