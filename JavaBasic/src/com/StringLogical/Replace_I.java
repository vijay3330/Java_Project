package com.StringLogical;

public class Replace_I 
{
		
			public static void main(String[] args)
			{
				String s="India is my country";
				
				String[] a=s.split(" ");
				
				for(int i=0; i<a.length;i++)
				{
					a[i] = a[i].replaceAll("[iI]", "@");
					
					for(int j=0; j<=i; j++)
					{
						System.out.print(a[j]+" ");
					}
					System.out.println();
				}
				
				
			}
}
