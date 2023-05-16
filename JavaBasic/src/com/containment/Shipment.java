package com.containment;

class Order
{
	int order_id1;
	int cust_id1;
	String cityname1;
	public int getOrder_id1() {
		return order_id1;
	}
	public void setOrder_id1(int order_id1) {
		this.order_id1 = order_id1;
	}
	public int getCust_id1() {
		return cust_id1;
	}
	public void setCust_id1(int cust_id1) {
		this.cust_id1 = cust_id1;
	}
	public String getCityname1() {
		return cityname1;
	}
	public void setCityname1(String cityname1) {
		this.cityname1 = cityname1;
	}
	
}

class Mydate
{
	int mm;
	int dd;
	int yy;
	
	public void set_Mm(int mm)
	{
		this.mm=mm;
	}
	
	public void set_Dd(int dd)
	{
		this.dd=dd;
	}
	
	public void set_Yy(int yy)
	{
		this.yy=yy;
	}
	
	public int get_Mm()
	{
		return mm;
	}
	
	public int get_Dd()
	{
		return dd;
	}
	
	public int get_Yy()
	{
		return yy;
	}
	
}



public class Shipment 
{

	private int shipment_id;
	private Order ord;
	private Mydate date;
	
	
	public void set_Shipmentid(int shipment_id )
	{
		this.shipment_id=shipment_id;
	}
	
	public void set_Ord(Order ord)
	{
		this.ord=ord;
	}
	
	public void set_Date(Mydate date)
	{
		this.date=date;
	}
	
	public int get_Shipmentid()
	{
		return shipment_id;
		
	}
	
	public Order get_Ord()
	{
		return ord;
	}
	
	public Mydate get_Date()
	{
		return date;
	}
	
	
	
	
	
	
}
