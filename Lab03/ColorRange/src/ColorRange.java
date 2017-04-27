/* -----------------------------------------------------------------------------
 *
 * File Name: ColorRange.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu		
 * Assignment:   EECS-168/169 Lab 3
 * Description:  This program will allow the user to enter a wavelength in nanometers and will return the corresponding color in the visible spectrum.
 * Date: 2/10/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class ColorRange {
	public static void main(String[] args)
	{
		//Declare the variable and tell user the instruction.
		double nm;
		System.out.println("Enter a wavelength in nm:");
		
		//Read the input from the keyboard.
		Scanner input = new Scanner(System.in);
		nm = input.nextDouble();
		
		//Assign if-else statement and display the output.
		if(nm >= 380 && nm < 450)
		{
			System.out.println("The color is Violet.");
		}
		else if (nm >= 450 && nm < 495)
		{
			System.out.println("The color is Blue.");
		}
		else if (nm >= 495 && nm < 570)
		{
			System.out.println("The color is Green.");
		}
		else if (nm >= 570 && nm < 590)
		{
			System.out.println("The color is Yellow.");
		}
		else if (nm >= 590 && nm < 620)
		{
			System.out.println("The color is Orange.");
		}
		else if (nm >= 620 && nm < 750)
		{
			System.out.println("The color is Red.");
		}
		else
		{
			System.out.println("The entered wavelength is not a part of the visible spectrum.");
		}
	}
	

}
