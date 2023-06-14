package com.lab;

public class CharOccurance 
{
		
			
			public static void main(String[] args) 
			{
				String s="java program";
				int count=0;
				for(int i=0; i<s.length() ; i++)
				{
					if(s.charAt(i) == 'a')
					{
						count++;
					}
					
					if(s.charAt(i) == 'a' && count==2)
					{
						System.out.println("INdex of Second 'a' : "+i);
					}
					
					
					
				}
				System.out.println("Total count of char 'a' : "+count );
				
			}
	
}
