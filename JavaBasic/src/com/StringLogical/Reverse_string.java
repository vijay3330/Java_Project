package com.StringLogical;

public class Reverse_string
{
			
			public static void main(String[] args)
			{
				String s="I Love India";
				String[] s1 = s.split(" ");
//				for(int i=s1.length-1;i>=0;i--)
//				{
//					System.out.print(s1[i]+" ");
//				}
				
				for(int i=0; i<s1.length; i++)
				{
					for(int j=s1[i].length()-1; j>=0; j--)
					{
						System.out.print(s1[i].charAt(j));
					}
					
					System.out.print(" ");
				}
				
				
				
			}	
			
}
