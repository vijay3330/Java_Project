package com.mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multiple_values
{
			public static void main(String[] args) 
			{
				HashMap<Integer, ArrayList<String>> hm=new HashMap();
				
				Scanner sc=new Scanner(System.in);
				
				for(int i=1; i<=3; i++)
				{
					System.out.println("Enter the Key");
					int key=sc.nextInt();
					
					ArrayList<String> al=new ArrayList<>();
					
					System.out.println("Enter names");
					
					for(int j=1;j<=2; j++)
					{
						al.add(sc.next());
					}
					
					hm.put(key, al);
					
				}
				
				System.out.println("/....................");
				
				for(Map.Entry<Integer, ArrayList<String>> m : hm.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
					
				}
				
				
			}
}
