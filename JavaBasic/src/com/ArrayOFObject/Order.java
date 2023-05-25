package com.ArrayOFObject;

import java.util.Arrays;
import java.util.Scanner;

class Menu
{
	int mid;
	String mname;
	int mprice;
	
	public Menu(int mid, String mname, int mprice) 
	{
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	
	
}

public class Order 
{
	int id;
	int qty;
	Menu menu[];
	
	public Order(int id, int qty, Menu[] menu) {
		super();
		this.id = id;
		this.qty = qty;
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", qty=" + qty + ", menu=" + Arrays.toString(menu) + "]";
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Order od[]=new Order[1];
		for(int i=0;i<od.length;i++)
		{
			System.out.println("Enter order id");
			int id=sc.nextInt();
			System.out.println("Enter the qty");
			int qty=sc.nextInt();
			System.out.println("Select menu");
			
			Menu me[]=new Menu[1];
			
			for(int j=0;j<me.length;j++)
			{
			System.out.println("Enter menu id");
			int mid=sc.nextInt();
			System.out.println("Enter Menu name");
			String mname=sc.next();
			System.out.println("Enter Menu Price");
			int mprice=sc.nextInt();
			
			me[j]=new Menu(mid,mname,mprice);
			}
			
			od[i]=new Order(id,qty,me);
			
		}
		
		for(int i=0;i<od.length;i++)
		{
			System.out.println(od[i]);
		}
		
		System.out.println("................");
	}
	
}
