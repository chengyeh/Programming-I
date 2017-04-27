/* -----------------------------------------------------------------------------
 *
 * File Name: UserLoop.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu		
 * Assignment:   EECS-168/169 Lab 3
 * Description:  This program will allow the user to control the starting point and ending point of a loop.
 * Date: 2/10/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class UserLoop {
	public static void main(String[] args)
	{
	    //Declare the variables.
		int startValue;
		int endingValue;
		
		//Read the input from the keyboard and tell the user where to enter it.
		Scanner input = new Scanner(System.in);
		System.out.println("Input a start value (included):");
		startValue = input.nextInt();
		System.out.println("Input an ending value (excluded):");
		endingValue = input.nextInt();
		
		//Assign for loop and display the output.
		for(int i = startValue;i < endingValue;i++)
		{
			System.out.println(i);
		}
		
		//Assign if statement and display the output.
		if(endingValue <= startValue)
		{
			System.out.println("Invalid input");
		}
	}

}
