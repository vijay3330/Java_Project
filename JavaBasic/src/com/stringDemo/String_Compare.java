package com.stringDemo;

public class String_Compare 
{
	
		public static void main(String[] args)
		{
			String str="Hello";
			String str1="hello";
			String str2=new String("Hello");
			String str3=new String("Hello");
			
//			System.out.println(str==str1); // Hello == Hello = true
//			System.out.println(str==str1); // Hello == hello = false
			
//			System.out.println(str.equals(str1)); // Hello == Hello = true
//			System.out.println(str.equals(str1)); //Hello == hello = false
			
//			System.out.println(str.equalsIgnoreCase(str1)); // Hello == Hello = true // Hello == hello = true
			
			// campareTo //0 str==str1, +ve str >str1, -ve str<str1
			
			System.out.println(str.compareTo(str1));
			
			
			String s="I Like India Country";
			
			char ch[] = s.toCharArray();
			for(char c : ch)
			{System.out.println(c);
			
			}
			
			String s2="java,c,c++,python";
			
			String st[] = s2.split(" ");
			
			for(String ss : st)
			{
				System.out.println(ss);
			}
			
			System.out.println("....................");
			
			char ch1[] = { 'w','e','l','c','o','m','e'};
			
			String st2= new String(ch1);
			
			System.out.println(st2);
			
			
			
			
		}
	
	
}
