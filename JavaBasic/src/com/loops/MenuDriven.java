package com.loops;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args)
	{
		// calculate area of circle
		
		Scanner sc=new Scanner(System.in);
		
		char ch;
		
		do
		{
			System.out.println("1.Calculate area of circle \n 2.Calculate area of rectangle \n 3.Calculate area of triangle \n 4.Calculate area of square");
			int choice=sc.nextInt();
			switch(choice)
			{
			
			 case 1: System.out.println("Enter the radious");	//pi*r^2
					int radious=sc.nextInt();
					double pi=3.14;
					double area_circle;
					
					area_circle=pi*(radious *radious);
					
					System.out.println("Area of a cicle is: " +area_circle);
					
					break;
					
		    case 2: System.out.println("Enter the length");    //length * width
				 	int length=sc.nextInt();
				 	System.out.println("Enter the width");
				 	int width=sc.nextInt();
				 	int area_rectangle;
				 	
				 	area_rectangle = length * width;
				 	
				 	System.out.println("Area of a rectangle is: " +area_rectangle);
				 	
				 	break;
				 
		   case 3: System.out.println("Enter the base value");  //base*height
		   		   int base=sc.nextInt();
		   		   System.out.println("Enter the height value");
		   		   int height=sc.nextInt();
		   		   int area_triangle;
		   		   
		   		   area_triangle = (base*height) / 2 ;
		   		   
		   		   System.out.println("Area of a triangle is: " +area_triangle);
		   		   
		   		   break;
			 		 
		  case 4: System.out.println("Enter the side a value");	//side a^2
		  		  int a=sc.nextInt();
		  		  int area_square;
		  		  
		  	      area_square = a * a;
		  	      
		  	      System.out.println("Area of a square is: " +area_square);
		  	      
		  	      break;
		  		  
				 
			 default :
				 	System.out.println("Invalid input");
			
			}
					
				System.out.println("Do you want to continue");
					ch=sc.next().charAt(0);
		
			
			}while(ch=='y' || ch=='Y');
			
			
			
			
		}

	}


