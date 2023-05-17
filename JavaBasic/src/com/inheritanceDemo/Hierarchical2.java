package com.inheritanceDemo;

class Electronic
{
	public void showElectricity()
	{
		System.out.println("Electricity is required for electrical and electronic devices");
	}
}

class TV extends Electronic
{
	public void showTV()
	{
		System.out.println("For watching tv electricity is required");
	}
}

class Battery extends Electronic
{
	public void showBattery()
	{
		System.out.println("For charging Battery Electricity is required");
	}
}

public class Hierarchical2
{

	public static void main(String[] args) {
		
		TV t=new TV();
		t.showElectricity();
		t.showTV();
		
		Battery b=new Battery();
		b.showElectricity();
		b.showBattery();
		
		
	}
	
}
