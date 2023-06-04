package com.stringDemo;

public class String_Words_Count
{
		
		public static void main(String[] args) 
		{
			String str= "india is best india is my country";
			
			String s[]=str.split(" ");
			
			for(int i=0; i<s.length;i++)
			{
				int count=0;
				boolean isvalid=false;
				for(int k=i-1; k>=0 ; k--)
				{
					if(s[i].equals(s[k]))
					{
						isvalid = true;
						break;
					}
				}
				if(isvalid==false)
				{
					for(int j=0 ; j<s.length ; j++)
					{
						if(s[i].compareTo(s[j])==0)	//if(s[i].equals[j]))
						{
							count++;
						}
					}
					System.out.println(s[i]+" "+count);
				}
				
			}
			
			
		}
	
	
}
