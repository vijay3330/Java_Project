package com.algo;
import java.util.Scanner;
public class Simple_Calculator 
{

	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double ans;
		char op;

		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter two numbers: ");	
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		
		op =sc.next().charAt(0);
		
		 switch(op) 
		 {
         case '+': ans = num1 + num2;
         
            break;
            
         case '-': ans = num1 - num2;
         
            break;
            
         case '*': ans = num1 * num2;
         
            break;
            
         case '/': ans = num1 / num2;
         
            break;
            
         default: System.out.printf("Error! Enter correct operator");
         
         return;
      }
      System.out.print("The result is given as follows:");
      
      System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
   }
		
		
}
