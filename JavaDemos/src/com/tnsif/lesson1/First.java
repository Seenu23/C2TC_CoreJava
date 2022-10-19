// java program to demonstrate naming conventions
package com.tnsif.lesson1;

public static void main(String[] args) 
{
		// TODO Auto-generated method stub
abstract class Demo {
	private Integer firstNumber = 100;
	Float secondNumber = 200.0f;
	Integer SPEEDLIMIT = 80;
	/* method to calculate product of two number */
	void dispOutput() 
	{
			
}
class DemoOne extends Demo
	{
	void calculateProduct()
	 {
		System.out.println("Product is ");
	 }
	}
public class First extends Demo
{
//class First extends Demo
	First obj = new First();	
	//obj.dispOutput(Demo);
	}
}
}

// A) Simple B) Encapsulation C) Abstraction D) Inheritance
// public private protected default