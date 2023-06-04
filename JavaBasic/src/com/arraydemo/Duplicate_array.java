package com.arraydemo;

import java.util.Arrays;

public class Duplicate_array 
{	
		public void findDuplicate(int a[],int b[], int c[])
		{		
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i];
				k++;
			}
			for(int i=0;i<b.length;i++)
			{
				boolean isAdded=false;
				
				for(int j=k-1;j>=0;j--)
				{
					if(c[j]==b[i])
					{
						isAdded=true;
						break;
					}
				}
				if(isAdded==false)
				{
					c[k]=b[i];
					k++;
				}
				
				
			}
			System.out.println(Arrays.toString(c));
			for(int i=0; i<k; i++)
			{
				System.out.print(c[i]+" ");
			}
			
			
			
		}
		
		
		public static void main(String[] args) 
		{
			int a[]= {1,2,3,4,5};
			System.out.println(Arrays.toString(a));
			int b[]= {1,3,6,7,4};
			System.out.println(Arrays.toString(b));

			int c[]=new int[a.length+b.length];
			
			Duplicate_array d=new Duplicate_array();
			d.findDuplicate(a, b, c);
			
			
			
		}
	
}
