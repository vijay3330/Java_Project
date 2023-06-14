package com.collection;

import java.util.ArrayList;

public class Display_even_position_element 
{
			
			public void evenPositionElement(ArrayList<Integer> al)
			{
				for(int i=0; i<al.size(); i++)
				{
					if(i%2==0)
					{
						System.out.println(al.get(i));
					}
				}
			}
			
			
			public static void main(String[] args)
			{
				ArrayList<Integer> al=new ArrayList<>();
				
				al.add(10);
				al.add(5);
				al.add(8);
				al.add(20);
				al.add(3);
				al.add(33);
				
				Display_even_position_element d= new Display_even_position_element();
				d.evenPositionElement(al);
			}
	
	
	
}
