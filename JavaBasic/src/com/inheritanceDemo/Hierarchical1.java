package com.inheritanceDemo;

class WaterAnimal
{
	String sea;
	public void showOcean()
	{
		System.out.println("WaterAnimals Presnt in Ocean");
	}
}

class Fish extends WaterAnimal
{
	public void showFish()
	{
		sea="Water";
		System.out.println("Fish lives in a "+sea);
	}
}

class Turtle extends WaterAnimal
{
	public void showTurtle()
	{
		sea="water";
		System.out.println("turtle lives in "+sea+" as well as on ground");
	}
}
public class Hierarchical1 
{
		public static void main(String[] args) {
			
			Fish f=new Fish();
			f.showFish();
			f.showOcean();
			
			Turtle t=new Turtle();
			t.showOcean();
			t.showTurtle();
			
		}
}
