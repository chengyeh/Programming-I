/* -----------------------------------------------------------------------------
 *
 * File Name: SummationOfFives.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This program will compute the sum of multiples of 5 that are greater than 1. 
 * Date: 2/24/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class SummationOfFives 
{
	public static void main(String[] args)
	{
		//Declare the variables.
		int endValue;
		int x = 0;
		int y = 0;
		
		//Read the input from the keyboard and ask the user to input the end value.
		Scanner kb = new Scanner(System.in);
		System.out.print("Please input a positive integer as the end value: ");
		endValue = kb.nextInt();
		
		//Assign while loop.
		while(x <= endValue)
		{
			y= y + x;
			x = x + 5;
		}
		
		//Display the output.
		System.out.println("The summation: " + y);
		
	}

}
