/* -----------------------------------------------------------------------------
 *
 * File Name: Lab08.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168 Lab 8
 * Description:  This program will create a 2D array based on the users specification and allow them to populate the 2D array.
 * Then using the ArrayHelper class to print the sum and average of each row, print the largest, sum, and average of the entire array.
 * Date: 4/07/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;
public class Lab08 
{
	public static void main(String[] args)
	{
		//Declare scanner and variables
		Scanner kb = new Scanner(System.in);
		int rows = 0;
		int columns = 0;
		int sum = 0;
		int max = 0;
		int sum2D = 0;
		double average = 0.0;
		double average2D = 0.0;
		
		//Ask user to input values of row and column
		System.out.print("How many rows?: ");
		rows = kb.nextInt();
		System.out.print("How many columns?: ");
		columns = kb.nextInt();
		
		//Declare and create an array
		int[][] grid = new int[rows][columns];
		
		//Get values of the array from user
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				System.out.print("Enter a value for position (" + i + "," + j + "): ");
				grid[i][j] = kb.nextInt();
			}
		}
		
		//Print 2D Array method
		ArrayHelper.print2DArray(grid);
		
		//Return 1D sum and average of all values methods  
		for(int i = 0; i < grid.length; i++)
		{
			sum = ArrayHelper.arraySum(grid[i]);
			average = ArrayHelper.arrayAvg(grid[i]);
			System.out.println("row " + i + " sum= " + sum + ", avg = " + average);
		}
		
		//Return 2D largest value in the entire array method
		max = ArrayHelper.arrayMax2D(grid);
		System.out.println("The largest value in the array is = " + max);
		
		//Return 2D sum of all values method
		sum2D = ArrayHelper.arraySum2D(grid);
		System.out.println("The sum for the entire array is = " + sum2D);
		
		//Return 2D average of all values method
		average2D = ArrayHelper.arrayAvg2D(grid);
		System.out.println("The average for the entire array is = " + average2D);
	}

}
