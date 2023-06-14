package com.ArrayOFObject;

import java.util.Scanner;

public class Moviemain 
{
			
			public static void main(String[] args)
			{
				Theater t[]= new Theater[2];
				Scanner sc=new Scanner(System.in);
				
				for(int i=0; i<t.length; i++)
				{
					System.out.println("Enter theater id");
					int t_id=sc.nextInt();
					System.out.println("Enter theater name");
					String t_name= sc.next();
					
					
					
				}
				
				for(int i=0; i<t.length; i++)
				{
					System.out.println(t[i]);
				}
			}
		
}
