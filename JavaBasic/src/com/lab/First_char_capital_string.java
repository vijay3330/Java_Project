package com.lab;

public class First_char_capital_string 
{
				
		public static void main(String[] args)
		{
			String s="india is beautiful country";
			
		   String[] a = s.split(" ");
		   for(int i=0; i<a.length; i++)
		   {
			   String currentstring=a[i];
			   char firstchar=currentstring.charAt(0);
			
			   if(firstchar >='a' && firstchar <= 'z')
			   {
				   	char uppercase = (char)(firstchar - 32); 
				   	a[i] =  uppercase + currentstring.substring(1);
			   }   
			  
		   }
		   
		   for(String str : a)
		   {
			   System.out.print(str+" ");
		   }
		
			
		}
	
			
}
