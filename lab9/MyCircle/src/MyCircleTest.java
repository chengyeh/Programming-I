/* -----------------------------------------------------------------------------
 *
 * File Name: MyCircleTest.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168 Lab 9
 * Description:  This program is to test the MyCircle class.
 * Date: 4/14/15
 *
 ---------------------------------------------------------------------------- */
public class MyCircleTest 
{
	public static void main(String[] args) 
	{
		// Declare a new circle called myCircle
		MyCircle myCircle = new MyCircle();
		
		//Assign the radius a value of 5.5
		myCircle.radius = 5.5;
		
		//Display a message to the screen that says "My circle has a radius of 5.5"
		System.out.println("My circle has a radius of " + myCircle.radius);

		//Declare two doubles, theArea and theCircum
		double theArea;
		double theCircum;
		
		//Use the method area() from myCircle to store the area in theArea
		theArea = myCircle.area();
		
		//Use the method circumference() from myCircle to store the circumference in theCircum
		theCircum = myCircle.circumference();
		
		//Display a message to the screen "The area is <put the area here>"
		System.out.println("The area is " + theArea);
		
		//Display a message to the screen "The circumference is <put the circumference here>"
		System.out.println("The circumference is " + theCircum);
		
		//Using only a method call to diameter(), write a message to the screen "The diameter is <put the diameter here>"
		printDiameter(myCircle);
	                
	}
		
	public static void printDiameter(MyCircle myCircle)
	{
		System.out.println("The diameter is " + myCircle.diameter());
	}

}