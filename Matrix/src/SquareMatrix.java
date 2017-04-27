/* -----------------------------------------------------------------------------
 *
 * File Name: SquareMatrix.java
 * Author: Cheng Yeh Lee 
 * KUID: 2482962
 * Email Address: chengyeh@ku.edu
 * Assignment:   EECS-168/169 Homework 2
 * Description:  This program will take a number n from the user and find its Square Matrix and Transpose of the Square Matrix.
 * Date: 3/4/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class SquareMatrix 
{
	public static void main(String[] args)
	{
		//Declare the variable.
		int size;
		
		//Read input from the keyboard and ask the user to enter a number.
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Size of the Square Matrix:");
		size = kb.nextInt();
		
		//Assign nested For loop for the Square Matrix and display the output.
		System.out.println("Square Matrix:");
		for(int row = 0; row < size; row++)
		{
			for(int col = 1; col <= size; col++)
			{
				System.out.print(col+(row * size) + " ");
			}
			System.out.println();
		}
		
		//Assign nested For loop for Transpose of the Square Matrix and display the output.
		System.out.println("Transpose:");
		for(int row = 0; row < size; row++)
		{
			for(int col = 1; col <= size * size; col = col + size)
			{
				System.out.print((col+row) + " ");
			}
			System.out.println();
		}
	}

}
