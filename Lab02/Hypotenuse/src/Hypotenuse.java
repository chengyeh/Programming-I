/* -----------------------------------------------------------------------------
 *
 * File Name:  Hypotenuse.java
 * Author: Cheng-Yeh Lee chengyeh@ku.edu 
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will calculate the hypotenuse of a right triangle.
 * Date: 2/3/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {
	public static void main(String[] args)
	{
		//Declare the variables and constants.
		double a;
		double b;
		double answer = 0.0;
		System.out.println("Will use the formula a^2 + b^2 = c^2 to solve for the hypotenuse of a triangle.");
		
		//Read the input from the keyboard and assign a and b.
		System.out.println("Input a value for a:");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		System.out.println("Input a value for b:");
		b = input.nextDouble();
		
		//Calculate the hypotenuse of a right triangle.
		answer = Math.sqrt(a*a+b*b);
		
		//Display the output.
		System.out.println("The hypotenuse is : " + answer);
	}
	

}
