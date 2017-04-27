/* -----------------------------------------------------------------------------
 *
 * File Name: MethodPractice.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 5
 * Description:  This program will have three different methods.
 * Date: 3/3/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class MethodPractice 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		//Declare the variables for the max method.
		int numberA = 0;
		int numberB = 0;
		//Read the two numbers from the keyboard.
		System.out.println("Input two numbers:");
		numberA = kb.nextInt();
		numberB = kb.nextInt();
		//Call the max method and print the output.
		int numberC = max(numberA, numberB);
		System.out.println("The max of " + numberA + " and " + numberB + " is: " + numberC);
		
		//Declare the variable for the sphereArea method.
		double radius = 0.0;
		//Read the radius from the keyboard.
		System.out.print("\nInput a radius: ");
		radius = kb.nextDouble();
		//Call the sphereArea method and assign if statement and display the output.
		double area = sphereArea(radius);
		if(radius > 0.0)
		{
			System.out.print("The area of a sphere with this radius is: " + area);
		}
		else
		{
			System.out.print("The area of a sphere with this radius is: 0.0");
		}
		
		//Declare the variables for the printWord method.
		String word = "";
		int times = 0;
		//Read the word from the keyboard.
		kb.nextLine();
		System.out.println("\n\nInput a string:");
		word = kb.nextLine();
		//Read the number from the keyboard.
		System.out.print("\nHow many times do you want to print it?: ");
		times = kb.nextInt();
		//Assign if statement and call the printWord method.
		if(times > 0)
		{
			printWord(word, times);
		}
		else
		{
			System.out.print("");
		}
	}
    
	//This method takes in two integers and returns the larger of the two number.
	public static int max(int a, int b)
	{
		//Assign if statement to compare the two number and return the larger number.
		if (a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}		
	}
	
	//This method takes in a radius and calculate the area of a sphere.
	public static double sphereArea(double radius)
	{
		//Method variable
		double area = 0.0;
		//Assign area formula.
		area = (4 * 3.14159) * (radius * radius);
		//Returning a value.
		return(area);
	}
	
	//This method will print a word over and over depends on the users' choice.
	public static void printWord(String word, int timesToPrint)
	{
		//Assign nested For loop.
		for(int i = 1; i <= timesToPrint; i++)
		{
			for(int j = 1; j <= 1; j++)
			{
				System.out.println(word);
			}
		}
	}
}
