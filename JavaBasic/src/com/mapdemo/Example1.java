package com.mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Example1 
{
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				ArrayList<String> al=new ArrayList<>();
				HashMap<String, Integer> hs=new HashMap<>();
				System.out.println("Enter color");
				for(int i=0; i<=5; i++)
				{
					al.add(sc.next());
				}
				
				System.out.println(al);
				
				for(int i=0; i<al.size();i++)
				{	boolean ispresent=true;
					int count=1;
					for(int j=i-1; j>=0;j--)
					{
						
						if(al.get(i).equals(al.get(j)))
						{
							ispresent=false;
							break;
							
						}
					}
					
					if(ispresent==true)
					{
						for(int k=i+1;k<al.size();k++)
						{
							if(al.get(i).equals(al.get(k)))
							{
								count++;
							}
						}
						
						if(count>=1)
						{
							System.out.println(al.get(i)+" "+count);
							
							hs.put(al.get(i), count);
						}
					}
				 
				}
				
				System.out.println(hs);
			}
}
