/* -----------------------------------------------------------------------------
 *
 * File Name: SumOfDigits.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 5
 * Description:  This program will take in an Integer value form the user and finds the sum of the digits.
 * Date: 3/3/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		//Declare the variables. 
		int no = 0;
		int yn = 0;
		//Assign the do while loop.
		do
		{   
			//Read the input from the keyboard.
			System.out.println("\nPlease enter a No:");
		    no = kb.nextInt();
		    //Call the addDigits method and display the output.
		    int sum = addDigits(no);
		    System.out.print("The sum of the digits is: " + sum);
		    System.out.println("\n\nWant to try again?(y=1/n=0):");
		    yn = kb.nextInt();
		    if(yn == 0)
		    {
		    	System.out.println("Thank you!");
		    }
		    
		}while(yn == 1);
	}
	
	//This method will return the sum of the digits.
	public static int addDigits(int x)
	{
		//Method variable
		int sum = 0;
		//Assign while loop and return a value.
		while(x>0)
		{
			 sum = x%10+sum;
			 x=x/10;
		}
		return(sum);
	}
}
