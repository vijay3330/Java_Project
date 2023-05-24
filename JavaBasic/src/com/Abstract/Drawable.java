package com.Abstract;

public interface Drawable 
{
		void show();
		default void m1()
		{
			System.out.println("Drawable1");
		}
}
