package com.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lab_assignment.Main;

public class a {

				public static void main(String[] args) {
					
					HashMap<Character,String> hs=new HashMap<>();
					
					hs.put('A', "Apple");
					hs.put('B', "Bat");
					hs.put('C', "Cat");
					hs.put('D', "Dog");
					
					System.out.println(hs);
					
					String v = hs.get('A');
					System.out.println(v);
					
					//get only keys using keyset
					
					 Set<Character> k = hs.keySet();
					 System.out.println(k);
					 
					Iterator<Character> it = k.iterator();
					
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
					
					//get only values
					
					Collection<String> s = hs.values();
				
						for(String ss:s)
						{
							System.out.println(ss);
						}
					
					//get entry set
						
					 Set<Entry<Character, String>> set1 = hs.entrySet();
					 
					 for(Map.Entry<Character, String> Map:set1)
					 {
						 System.out.println(Map.getKey()+" "+Map.getValue());
					 }
					
					
					
					
					
					
					
					
					
				}
}
