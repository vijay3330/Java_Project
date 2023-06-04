package com.stringDemo;

import java.util.Arrays;

public class Sort_String_Length
{		
		public void sortLength(String str)
		{
			String st[]= str.split(" ");
			System.out.println(Arrays.toString(st));
			
			for(int i=0; i<st.length; i++)
			{
				for(int j=i+1; j<st.length; j++)
				{
					if(st[i].length() > st[j].length())
					{
						String temp=st[i];
						st[i]=st[j];
						st[j]=temp;
								
					}
					else if(st[i].length()==st[j].length())
					{
						if(st[i].compareTo(st[j]) > 0)
						{
							String temp = st[i];
							st[i]=st[j];
							st[j]=temp;
						}
					}
				}
			}
			System.out.println(Arrays.toString(st));
			
		}
		
		public static void main(String[] args) 
		{
			String str = "India is my best country";
			
			Sort_String_Length s=new Sort_String_Length();
			s.sortLength(str);
			
		}
	
}
