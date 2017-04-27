/* -----------------------------------------------------------------------------
 *
 * File Name: Lab07.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 7
 * Description:  This program will create an array which its size is determined by the user. It will store values from the user into the array and display them.
 * Then it will ask the user to enter a new size of array and display the new array. At the end, it will count a value from the user and find max and min values 
 * of the new array.
 * Date: 3/31/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
import java.util.Arrays;

public class Lab07 
{
	public static void main(String[] args)
	{
		//Declare the variables
		Scanner kb = new Scanner(System.in);
		int size1 = 0;
		int size2 = 0;
		int count = 0;
		double value = 0.0;
		double min = 0.0;
		double max = 0.0;
		double[] arr1 = null;
		double[] arr2 = null;
		//Ask the user how many numbers he/she wants to store 
		do
		{
			System.out.print("Input an array size: ");
			size1 = kb.nextInt();
		
		}while (size1 <= 0);
		System.out.println("\nNow please enter " + size1 + " numbers");
		//Create an array of doubles that can hold the number specified by the user
		arr1 = new double[size1];
		//Ask the user to input values for the array
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.print("Input a number into your array: ");
			arr1[i] = kb.nextDouble();
		}
		System.out.println("Here are all the numbers in your array:");
		//Call method 1 to print the array
		printArray(arr1);
		//Ask the user for a new array size
		do
		{
			System.out.print("\nInput a new size: ");
			size2 = kb.nextInt();
			
		}while (size2 <= size1);
		//Call method 2
		arr2 = arrayResize(arr1,size2);
		//Call method 1 to print the new array
		printArray(arr2);
		
		System.out.print("\nEnter a value to count: ");
		value = kb.nextDouble();
		//Call method 3
		count = count(arr2, value);
		if(count == 1)
		{
			System.out.println(value + " occurs " + count + " time in the array.");
		}
		else
		{
			System.out.println(value + " occurs " + count + " times in the array.");
		}
		
		//Call method 4
		min = min(arr2);
		System.out.println("Min value in array: " + min);
		//Call method 5
		max = max(arr2);
		System.out.println("Max value in array: " + max);
	}
	
	//Method 1: Prints the array
	public static void printArray(double[] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	//Method 2: Creates a new array according to newSize
	public static double[] arrayResize(double[] oldArray, int newSize)
	{
		double[] arr2 = new double[newSize];
		for(int i = 0; i < oldArray.length; i++)
		{
			arr2[i] = oldArray[i];
		}
		
		System.out.println("You need to add " + (newSize-oldArray.length) + " values");
		
		for(int i = oldArray.length; i < newSize; i++)
		{
			System.out.print("Input a number to add to your array: ");
			Scanner kb = new Scanner(System.in);
			arr2[i] = kb.nextDouble();
		}
		return arr2;
	}
	
	//Method 3: Determines how many times the value appears in the array
	public static int count(double[] arr, double value)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == value)
			{
				count++;
			}
		}
		return count;
	}
	
	//Method 4: Returns the smallest number in the array
	public static double min(double[] arr)
	{
		double min = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	//Method 5: Return the largest number in the array
	public static double max(double[] arr)
	{
		double max = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

}
