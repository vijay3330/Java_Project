package com.lab;

class order
{
	int order_id;
	int cust_id;
	String city;
	public order(int order_id, int cust_id, String city)
	{
		this.order_id=order_id;
		this.cust_id=cust_id;
		this.city=city;
	}
	
}

class mydate
{
	int mm;
	int dd;
	int yy;
	
	public mydate(int mm, int dd, int yy)
	{
		this.mm=mm;
		this.dd=dd;
		this.yy=yy;
	}
}
public class Shipment
{

	int shipment_id;
	order odr;
	mydate  date;
	
	public Shipment(int shipment_id, order odr, mydate date)
	{
		this.shipment_id=shipment_id;
		this.odr=odr;
		this.date=date;
	}
	
	public static void main(String[] args)
	{
		Shipment s=new Shipment(100,new order(33,97,"Pune"),new mydate(03,28,2023));
		System.out.println(s.shipment_id);
		System.out.println(s.odr.order_id);
		System.out.println(s.odr.cust_id);
		System.out.println(s.odr.city);
		System.out.println(s.date.mm+" "+s.date.dd+" "+s.date.yy);
	}
	
	
	
	
	
	
	
	
}
