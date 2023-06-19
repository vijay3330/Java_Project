package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo1 
{
			
			public static void main(String[] args)
			{
				//non-generic
				ArrayList list = new ArrayList();
				list.add("pune");
				list.add(45);
				list.add('p');
				list.add(89.56);
				System.out.println(list);
				
				//generic 
				
				ArrayList<String> al=new ArrayList<>();
				
				al.add("pune"); 
				al.add("mumbai");
				al.add("pune");	// we can store same element
				al.add("goa");
				al.add("nasik"); 
				al.add(null);	// we can store null values
			
				System.out.println(al);
				
				System.out.println("*********** For traditional **********");
				
				for(int i=0; i<al.size();i++)
				{
					System.out.println(al.get(i));
				}
				
				System.out.println("********** Enhanced Forloop ***********");
				
				for(String s : al)
				{
					System.out.println(s);
				}
				
				System.out.println("*********** Using Iterator *************");
				
				Iterator<String> itr= al.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				System.out.println("///////////////////////////");
				
				ListIterator<String> ltr=al.listIterator();
				
				while(ltr.hasNext())
				{
					ltr.next();
				}
				
				while(ltr.hasPrevious())
				{
					System.out.println(ltr.previous());
				}
				
				System.out.println("*****************");
				
				ListIterator<String> ltr2 = al.listIterator(al.size());
				
				while(ltr2.hasPrevious())
				{
					System.out.println(ltr2.previous());
				}
				
				
				
				
				
			}
	
	
	
}
