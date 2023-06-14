package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo 
{
		
		public static void main(String[] args) 
		{
			Vector<String> v=new Vector<>();
			v.add("red"); // this add method is from collection we can add elements from this add method
			v.addElement("green"); // this addElement method is vector class own method
			v.add("blue");
			
			System.out.println(v);
			
			Enumeration<String> e=v.elements();
			
			while(e.hasMoreElements())
			{
				// System.out.println(e.nextElement());
				
				String s=e.nextElement();
				if(s.equalsIgnoreCase("green"))
				{
					v.remove(s);
				}
			}
			
			System.out.println(v);
			
		}
	
	
	
}
