/* -----------------------------------------------------------------------------
 *
 * File Name: NumberGuessingGame.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This game will make the user guess a specific number, 73.
 * Date: 2/24/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class NumberGuessingGame 
{
	public static void main(String[] args)
	{
		//Declare the variable.
		int guess;
		
		//Read the input from the keyboard.
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the number guessing game.");
		
		//Assign do-while loop.
		do
		{   System.out.print("Guess a number: ");
			guess = kb.nextInt();
			if(guess > 73)
			{
				System.out.println("Sorry, you guess is too high.");
			}
			if(guess < 73)
			{
				System.out.println("Sorry, you guess is too low.");
			}
			if(guess == 73)
			{
				System.out.println("You win!");
			}
		} while(guess != 73);
	}

}
