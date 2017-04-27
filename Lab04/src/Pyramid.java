/* -----------------------------------------------------------------------------
 *
 * File Name: Pyramid.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This program will print a triangle of asterisks of size n.
 * Date: 2/24/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class Pyramid 
{
	public static void main(String[] args)
	{
		//Declare the variable.
		int n;
		
		//Read the input from the keyboard and ask the user to enter a number.
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of asterisks for the base of the triangle: ");
		n = kb.nextInt();
		System.out.println();
		
		//Assign nested loop and display the output.
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
}
