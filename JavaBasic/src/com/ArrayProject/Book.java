package com.ArrayProject;
import java.util.*;
public class Book {

	int book_id;
	String book_name;
	int price;
	String author_name;
	Book[] book;
	Scanner sc;
	
	public Book()
	{
		sc=new Scanner(System.in);
	}
	
	public Book(int book_id, String book_name, int price, String author_name) {
		
		this.book_id = book_id;
		this.book_name = book_name;
		this.price = price;
		this.author_name = author_name;
	}
	@Override
	public String toString() {
		return "[book_id=" + book_id + ", book_name=" + book_name + ", price=" + price + ", author_name="
				+ author_name + "]";
	}
	public void insertBook(Book [] book)
	{
		this.book=book;
	}
	public void showAllBooks()
	{
		for(int i=0;i<book.length;i++)
		{
			if(book[i]!=null)
			{
			System.out.println(book[i]);
			}
		}
	}
	public void findBookById(int id)
	{
	   for(int i=0;i<book.length;i++)
	   {
		   if(book[i]!=null)
		   {
			   if(book[i].book_id==id)
			   {
				   System.out.println(book[i]);
			   }
		   }
	   }
		
	}
	
	public void updateBook(int id) {
		
		System.out.println("enter the price for updateion");
		int price=sc.nextInt();
		boolean isUpdated=false;
		for(int i=0;i<book.length;i++)
		{
			if(book[i]!=null)
			{
				if(book[i].book_id==id)
				{
					book[i].price=price;
					isUpdated=true;
				}
			}
		}
		
		if(isUpdated==true)
		{
			System.out.println("Update successfully......");
		}
		else
		{
			System.out.println("Pls check somthing is wrong....");
		}
		
		
	}
	


}
