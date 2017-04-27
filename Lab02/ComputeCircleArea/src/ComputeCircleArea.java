/* -----------------------------------------------------------------------------
 *
 * File Name:  ComputeCircleArea.java
 * Author: Cheng-Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will compute the area of the circle, where the radius is received
 *                      from the user.
 * Date: 2/3/15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;

public class ComputeCircleArea {
	public static void main(String[] args)
	{
		//Declare the variables and constants.
		final double PI = 3.141592;
		double radius;
		double area;
		
		//Read the input from the keyboard and assign radius.
		System.out.println("Enter the number for radius:");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		//Calculate the area of the circle.
		area = PI * radius * radius;
		
		//Display the output
		System.out.println("\nThe area for the circle of radius " + radius +" is " + area);
	}

}
