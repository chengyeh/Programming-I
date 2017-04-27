/* -----------------------------------------------------------------------------
 *
 * File Name: ArrayHelper.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168 Lab 8
 * Description:  This program is a list of methods in the class to help another class.
 * Date: 4/07/15
 *
 ---------------------------------------------------------------------------- */
public class ArrayHelper 
{
	//Takes in a 2D array and prints it
	public static void print2DArray(int[][] array)
	{
		System.out.println("Here is your array");
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if(j < array[i].length-1)
				{
					System.out.print(array[i][j] + ", ");
				}
				else
				{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	//Takes in a 1D array and returns the sum of all values
	public static int arraySum(int[] array)
	{
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}
	
	//Takes in a 1D array and returns the average of all values
	public static double arrayAvg(int[] array)
	{
		double sum = 0;
		double average = 0.0;
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		average = sum / array.length;
		return average;
	}
	
	//Takes in a 2D array and returns the largest value in the entire array
	public static int arrayMax2D(int[][] array)
	{
		int max = array[0][0];
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if(max < array[i][j])
				{
					max = array[i][j];
				}
			}
		}
		return max;
	}
	
	//Takes in a 2D array and returns the sum of all values
	public static int arraySum2D(int[][] array)
	{
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				sum = sum + array[i][j];
			}
		}
		return sum;
	}
	
	//Takes in a 2D array and returns the average of all values
	public static double arrayAvg2D(int[][] array)
	{
		double sum = 0;
		double average = 0.0;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				sum = sum + array[i][j];
			}
		}
		average = sum / (array.length * array[0].length);
		return average;
	}

}
