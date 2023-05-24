package com.Abstract;

public interface Drawable2 
{
		
	void show();
	default void m1()
	{
		System.out.println("Drawable2");
	}
	
}
