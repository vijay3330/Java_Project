package com.StringLogical;

public class Reverse_Middle_Words
{

		public static void main(String[] args) 
		{
			String s="Hi how are you students";
			String[] a = s.split(" ");
			
			for(int i=0; i<a.length;i++)
			{
				if( i==1 || i==2 || i==3 )
				{	
					for(int j=a[i].length()-1;j>=0;j--)
					{
						System.out.print(a[i].charAt(j));
						
						
					}
					
					System.out.print(" ");
				}
				else
				{	
				  System.out.print(a[i]+" ");
				}
				
			}
			
			
			
			
		}
		
		
	
	
	
	
}
