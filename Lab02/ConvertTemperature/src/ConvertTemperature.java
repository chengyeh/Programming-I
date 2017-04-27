/* -----------------------------------------------------------------------------
 *
 * File Name:  ConvertTemperature.java
 * Author: Cheng-Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: 2/3/15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;

public class ConvertTemperature {
	public static void main(String[] args)
	{
		//Declare the variables and constants.
		double fahrenheit;
		double celsius;
		
		//Read the input from the keyboard and assign Fahrenheit.
		System.out.println("Enter the temperature in Fahrenheit:");
		Scanner input = new Scanner(System.in);
		fahrenheit = input.nextDouble();
		
		//Calculate the temperature from Fahrenheit to Celsius.
		celsius = (fahrenheit-32)*(5.0/9);
		
		//Display the output.
		System.out.println("\n*Conversion:" + "\n" + fahrenheit + " degrees Fahrenheit = " + celsius + " degress Celsius.");
		
	}
	

}
