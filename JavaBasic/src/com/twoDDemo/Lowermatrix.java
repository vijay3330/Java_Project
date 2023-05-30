package com.twoDDemo;

public class Lowermatrix 
{
		
		public void lowerMatrix(int a[][])
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(i>=j)
					{
						System.out.print(a[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	
	
	
		public static void main(String[] args) 
		{
			int a[][]= { {1,2,3}, {6,4,9}, {7,3,2} };
			
			Lowermatrix l=new Lowermatrix();
			l.lowerMatrix(a);
		}
	
}
