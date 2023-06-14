package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Find_odd_position_Iterator 
{
		
		public void oddPositionElement(ArrayList<Integer> al)
		{
			Iterator<Integer> itr= al.iterator();
			
			while(itr.hasNext())
			{
				if(itr.next()%2==1)
				{
					System.out.println(itr.next());
				}
			}
			
			
			
			
			
		}
		
		
		public static void main(String[] args) 
		{
			ArrayList<Integer> al=new ArrayList<>();
			al.add(1);
			al.add(22);
			al.add(9);
			al.add(8);
			al.add(3);
			al.add(4);
			
			Find_odd_position_Iterator f=new Find_odd_position_Iterator();
			f.oddPositionElement(al);
		}
	
		
		
}
