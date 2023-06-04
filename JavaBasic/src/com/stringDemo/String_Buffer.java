package com.stringDemo;

public class String_Buffer 
{
		
		public static void main(String[] args) 
		{
			StringBuffer sb=new StringBuffer();
			sb.append("pune");
			System.out.println(sb);
			
			sb.append(" welcome 40");
			System.out.println(sb);
			
			sb.insert(3, "City");
			System.out.println(sb);
			
		//	System.out.println(sb.reverse());
			
			sb.delete(3, 6);
			System.out.println(sb);
		}
	
}
