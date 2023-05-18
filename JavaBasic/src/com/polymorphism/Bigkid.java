package com.polymorphism;

public class Bigkid extends Kid
{
		
		public void redBook(String book1, String book2)
		{
			System.out.println(book1);
		}
	
		public static void main(String[] args) {
			
			Bigkid b=new Bigkid();
			
			b.readBook();
			b.readBook("Physics", "Chemistry");
			b.redBook("BhagvatGita", "Harry Potter");
			
		}
		
}
