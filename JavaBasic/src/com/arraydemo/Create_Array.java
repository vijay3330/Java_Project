package com.arraydemo;

import java.util.*;

public class Create_Array {

	public static void main(String[] args)
	{	
		// ways to create array 
		int arr[] = {1,2,3,4,5};		
		System.out.println(arr); // display #code for display element use toString method
		
		//or
		
		int a[]= new int[5];
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=5;
		a[4]=6;
		System.out.println(Arrays.toString(a));	//array display element use toString method
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("---------------------------");
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("For Each loop (Enhance loop");
		
		for(int x : a)
		{
			System.out.println(x);
		}
		
		
		
		
	}
}
