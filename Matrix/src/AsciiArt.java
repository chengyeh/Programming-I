/* -----------------------------------------------------------------------------
 *
 * File Name: AsciiArt.java
 * Author: Cheng Yeh Lee 
 * KUID: 2482962
 * Email Address: chengyeh@ku.edu
 * Assignment:   EECS-168/169 Homework 2
 * Description:  This program will create a nXn grid, a checkerboard and a diagonal reflected across the y-plane depending on the users input.
 * Date: 3/4/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class AsciiArt 
{
	public static void main(String[] args)
	{
		//Declare the variables.
		int userChoice;
		int size;
		
		//Read input from the keyboard and ask the user to enter a number.
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose one of the following patterns by typing the corresponding number:\n1) Stripes\n2) Checker Board\n3) Double Diagonal (aka the X)\n4) Two Islands");
		userChoice = kb.nextInt();
		
		//Assign if statement and nested For loop for choice #1 : "Stripes" and display the output.
		if(userChoice == 1)
		{
			//Read the input from the keyboard.
			System.out.println("\nInput a size (must be larger than 1):");
			size = kb.nextInt();
			System.out.println();
			
			if(size > 1)
			{
				for(int row = 0; row < size; row++)
				{
					for(int col = 0; col < size; col++)
					{
						if((col%2) == 0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print("\n");
				}
			}
			else
			{
				System.out.println("Error.");
			}
		}
		
		//Assign if statement and nested For loop for choice #2 : "Checker Board" and display the output.
		if(userChoice == 2)
		{
			//Read the input from the keyboard.
			System.out.println("\nInput a size (must be larger than 1):");
			size = kb.nextInt();
			System.out.println();
			
			if(size > 1)
			{
				for(int row = 0; row < size; row++)
				{
					for(int col = 0; col < size; col++)
					{
						if(((row + col)%2) == 0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print("\n");
				}
				
			}
			else
			{
				System.out.println("Error.");
			}
		}
		
		//Assign if statement and nested For loop for choice #3 : "Double Diagonal" and display the output.
		if(userChoice == 3)
		{
			//Read the input from the keyboard.
			System.out.println("\nInput a size (must be larger than 1):");
			size = kb.nextInt();
			System.out.println();
			
			if(size > 1)
			{
				for(int row = 0; row < size; row++)
				{
					for(int col = 0; col < size; col++)
					{
						if(row == col || row + col == size -1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print("\n");
				}
			}
			else
			{
				System.out.println("Error.");
			}
		}
		
		//Assign if statement and nested For loop for choice #4 : "Two Islands" and display the output.
		if(userChoice == 4)
		{
			//Read the input from the keyboard.
			System.out.println("\nInput a size (must be larger than 1):");
			size = kb.nextInt();
			System.out.println();
			
			if(size > 1)
			{
				for(int row = 1; row <= size; row++)
				{
					for(int col = 1; col <= size; col++)
					{
						if(row + col == size + 1)
						{
							System.out.print("*");
						}
						else if(row <= size/2 && col <= size/2)
						{
							System.out.print("!");
						}
						else if(row > size - (size/2) && col > size - (size/2))
						{
							System.out.print("?");
						}
						else
						{
							System.out.print("~");
						}
						
					}
					System.out.println();
				}
			}
			else
			{
				System.out.println("Error.");
			}
		}
		else if(userChoice < 1 || userChoice > 4)
		{
			System.out.println("\nError.");
		}
		
	}

}
