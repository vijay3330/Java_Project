package com.hashmapdemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingHashMap 
{
				
				public static void main(String[] args)
				{
					HashMap<String, Float> smap=new HashMap<>();
					
					smap.put("sam", 89.6f);
					smap.put(null, 0f);
					smap.put("Akshat", 90.5f);
					smap.put("Amey", 94.3f);
					
					// Iteration 
					
					System.out.println(smap);
					
					System.out.println("==============");
					System.out.println("All Keys----------->");
					
					//Keys.....
					
					Set<String> keyset = smap.keySet();
					
					for(String s: keyset)
					{
						System.out.println(s);
					}
					
					//values 
					
					System.out.println("=====================");
					System.out.println("All Values------------>");
					
					Collection<Float> marks= smap.values();
					for(Float m:marks)
					{
						System.out.println(m);
					}
					
					// key value pair	
					
					for(Map.Entry<String, Float> en: smap.entrySet())
					{
						System.out.println(en.getKey()+"--->"+en.getValue());
					}
					
					
				}
	
		
}
