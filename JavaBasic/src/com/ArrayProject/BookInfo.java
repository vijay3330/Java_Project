package com.ArrayProject;

import java.util.Scanner;

public class BookInfo {

	public static void main(String[] args) {
		Book book[]=new Book[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book Details");
		for(int i=0;i<book.length;i++)
		{
			System.out.println("Enter the book id");
			int bid=sc.nextInt();
			System.out.println("Entre the book name");
			String bname=sc.next();
			System.out.println("Entre the price");
			int price=sc.nextInt();
			System.out.println("Enter the auther name");
			String a_name=sc.next();
			book[i]=new Book(bid,bname,price,a_name);
			
		}
		
		
		Book mybook=new Book();
		mybook.insertBook(book);
		System.out.println("....................Show All.......................");
		mybook.showAllBooks();
		
		System.out.println(".........................SearchBook................");
		mybook.findBookById(1);
		
		System.out.println(".......................UpdateBook...................");
		mybook.updateBook(1);
		
		mybook.showAllBooks();

	}

}
