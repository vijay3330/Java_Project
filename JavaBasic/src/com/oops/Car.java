package com.oops;

public class Car {
	int model_No;
	String carname;
	double price;
	String color;

	public static void main(String[] args) {
		Car Maruti = new Car();
		Maruti.carname = "Wagon R";
		Maruti.color = "Pearl White";
		Maruti.model_No = 1234;
		Maruti.price = 600000;

		System.out.println("Car Name:" + " " + Maruti.carname + "Color:" + " " + Maruti.color + " " + "Model_NO:" + " "
				+ Maruti.model_No + " " + "Price:" + " " + Maruti.price);

		Car Tata = new Car();
		Tata.carname = "Safari";
		Tata.color = "Ocean Blue";
		Tata.model_No = 5678;
		Tata.price = 2200000;

		System.out.println("Car Name:" + " " + Tata.carname + "Color:" + " " + Tata.color + " " + "Model_NO:" + " "
				+ Tata.model_No + " " + "Price:" + " " + Tata.price);

		Car Mahindra = new Car();
		Mahindra.carname = "XUV 700";
		Mahindra.color = "Rose RED";
		Mahindra.model_No = 9123;
		Mahindra.price = 1800000;

		System.out.println("Car Name:" + " " + Mahindra.carname + "Color:" + " " + Mahindra.color + " " + "Model_NO:"
				+ " " + Mahindra.model_No + " " + "Price:" + " " + Mahindra.price);

	}
}
