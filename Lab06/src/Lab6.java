/* -----------------------------------------------------------------------------
 *
 * File Name: Lab6.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 6
 * Description:  This program will create an array which its size is determined by the user. It will store the values from the user into the array and find the sum, max, min, and average.
 * Date: 3/24/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class Lab6 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int arraySize = 0;
		//Ask the user to input a size of the array and use do while loop to make sure they give a value greater than 0.
		do
		{
			System.out.print("Input an array size: ");
            arraySize = kb.nextInt();
            
		}while(arraySize == 0);
		
		//Create an array.
		int[] userNums = new int[arraySize];
		System.out.println("Now please enter " + arraySize + " numbers");
		//Ask the user to input values for the array.
		for(int i = 0; i < userNums.length; i++)
		{
			System.out.print("Input a number into your array: ");
			userNums[i] = kb.nextInt();
		}
		
		System.out.println("Here are all the numbers in your array:");
		//Display all the values back to the user.
		for(int i = 0; i < userNums.length; i++)
		{
			System.out.println(userNums[i]);
		}
		
		//Calculate the sum from the values in the array.
		int sum = 0;
		for(int i = 0; i < userNums.length; i ++)
		{
			sum = sum + userNums[i];
		}
		System.out.println("The sum of all the values is: " + sum);
		
		//Calculate the average.
		int average = 0;
		average = sum / arraySize;
		System.out.println("The average of all the values is: " + average);
		
		//Find the maximum and minimum values in the array.
		int max = userNums[0];
		int min = userNums[0];
		for(int i = 0; i < userNums.length; i ++)
		{
			if(max < userNums[i])
			{
				max = userNums[i];
			}
			if(min > userNums[i])
			{
				min = userNums[i];
			}
		}
		System.out.println("The largest value is : " + max);
		System.out.println("The smallest value is : " + min);
	}

}
