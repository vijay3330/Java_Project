package com.lab;

public class Boook 
{
	private int id;
	private String book_name;
	private int price;
	
	
	
	public void set_Id(int id)
	{
		this.id=id;
	}
	
	public void set_Bookname(String book_name)
	{
		this.book_name=book_name;
	}
	
	public void set_Price(int price)
	{
		this.price=price;
	}
	
	public int get_Id()
	{
		return id;
	}
	
	public String get_Bookname()
	{
		return book_name;
	}
	
	public int get_Price()
	{
		if(book_name=="java" || book_name=="Java")
		{
			int discount = (price * 10)/100;
			price= price- discount;
			return price;
		}
		else
		{
			return price;
		}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Boook b=new Boook();
		b.set_Id(101);
		b.set_Bookname("java");
		b.set_Price(500);
		System.out.println("Book ID: "+b.get_Id()+" Book name: "+b.get_Bookname()+" Book price: "+b.get_Price() );
	}
	
}
