package com.twoDDemo;

public class FindClosMax 
{

	public void findclosmax(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(max<a[j][i])
				{
					max=a[j][i];
				}
			}
			System.out.println(max);
		}
	}
	
	
	public static void main(String[] args) 
	{

		int a[][]= { {1,2,3}, {6,4,9}, {7,3,2} };
		
		FindClosMax f=new FindClosMax();
		f.findclosmax(a);
	}
	
	
}
