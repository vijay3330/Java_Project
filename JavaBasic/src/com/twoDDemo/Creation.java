package com.twoDDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Creation 
{
	public static void main(String[] args) 
	{
//		int a[][]= {{1,2,3},
//				    {4,5,6},
//				    {7,8,9}};
		
		
		int arr[][]= new int[3][2];
		arr[0][0]=7;
		arr[0][1]=8;
		arr[1][0]=9;
		arr[1][1]=4;
		arr[2][0]=5;
		arr[2][1]=6;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(".......................");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("..........................");
		
		for(int x[] : arr )
		{
			for(int y : x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("............................");
		
		System.out.println(Arrays.deepToString(arr));
	}
}
