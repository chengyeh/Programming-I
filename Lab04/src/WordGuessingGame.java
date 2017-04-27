/* -----------------------------------------------------------------------------
 *
 * File Name: WordGuessingGame.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This game requires the user to guess a secret word. The secret word that user must guess is "valentine".
 * Date: 2/24/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class WordGuessingGame 
{
	public static void main(String[] args)
	{
		//Declare the variable.
		String guess;
		System.out.println("Welcome to the word guessing game.");
		
		//Read the input from the keyboard and ask the user to guess a word.
		Scanner kb = new Scanner(System.in);
		System.out.print("Guess a word: ");
		
		//Assign do-while loop.
		do
		{   guess = kb.nextLine();
			if(guess.equals("valentine"))
			{
				System.out.println("You win!");
			}
			else
			{
				System.out.print("Incorrect. Guess again: ");
			}
		} while(!guess.equals("valentine"));
	}
 
}
