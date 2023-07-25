package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Fail_Fast_Safe 
{
		
		public static void main(String[] args) 
		{
			ArrayList<String> al=new ArrayList<>();
			
			al.add("pune");
			al.add("pune");
			al.add("mumbai");
			al.add("goa");
			al.add("Banglor");
			al.add("nagpur");
			al.add("nasik");
			
			
			System.out.println(al);
			
			System.out.println("-----------------------------");
			Iterator<String> itr =al.iterator();
			while(itr.hasNext())
			{
				String s=itr.next();
				
				if(s.equalsIgnoreCase("Goa"))
				{
					// al.remove(s);	// Fail -Fast because arraylist is synchronous (we can't perform multiple operations at same time )
					
					//itr.remove(); // Fail - safe because iterator is asynchronous (we can perform multiple operations at same time)
				}
			}
			
			System.out.println(al);
			
		}
}
