/* -----------------------------------------------------------------------------
 *
 * File Name: Multiples.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu		
 * Assignment:   EECS-168/169 Lab 3
 * Description:  This program will print the multiples of numbers for the user.
 * Date: 2/10/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class Multiples {
	public static void main(String[] args)
	{
		//Declare the variables.
		int number;
		int multiples;
		
		//Read the input from the keyboard and tell the user where to enter it.
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you wish to see multiples of?");
		number = input.nextInt();
		System.out.println("How many multiples?");
		multiples = input.nextInt();
		
		//Assign for loop and display the output.
		for(int i = 1;i <= multiples;i++)
		{
			System.out.println(number*i);
		}
		//Assign if statement and display the output.
		if(multiples <= 0)
		{
			System.out.println("Error: The amount of multiples to display must be greater than zero");
		}
	}

}
