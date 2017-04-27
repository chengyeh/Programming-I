/* -----------------------------------------------------------------------------
 *
 * File Name: BananaStand.java
 * Author: Cheng Yeh Lee
 * KUID: 2482962
 * Email Address: chengyeh@ku.edu
 * Assignment:   EECS-168/169 Homework 1
 * Description: This is a banana stand simulator. It will take orders for bananas from the user and calculate the cost based on the specifics of the order.  
 * Date: 2/20/15 
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class BananaStand {
	public static void main(String[] args)
	{
        //Declare the variables.
        String type;
        String color;
        char t = '\0';
        char c = '\0';
        int numberBanana = 0;
        double beforeCost = 0.00;
        double totalMarkups = 0.00;
        double totalDiscount = 0.00;
        double totalCost = 0.00;
        final double shipping = 35.50;
        String address;
        String city;
        String state;
        int zipCode;

        //Read the choices of type and color from the keyboard and tell the user where to enter them. 
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the Banana Stand!\n--------------------\nSelect type of banana:\nRegular (r/R) (no markup)\nOrganic (o/O) (20% markup)\nSaturated with Gamma Rays (g/G) (50% markup)\nInput your choice:");
        type = input.nextLine();
        t = type.charAt(0);
        System.out.print("--------------------\nSelect color of banana:\nYellow (y/Y) (no discount)\nGreen (g/G) (10% discount)\nMixed (m/M) (5% discount)\nInput your choice:");
        color = input.nextLine();
        c = color.charAt(0);
        System.out.print("--------------------\nHow many bananas do you want?:");
        numberBanana = input.nextInt();
        beforeCost = numberBanana * 0.03;

        //Read the input from the keyboard and tell the user where to enter his or her address.
        input.nextLine();
        System.out.println("--------------------");
        System.out.print("Input your street address: ");
        address = input.nextLine();
        System.out.print("Input your city: ");
        city = input.nextLine();
        System.out.print("Input your state (please enter a whole word): ");
        state = input.nextLine();
        System.out.print("Input your zip code: ");
        zipCode = input.nextInt();
  
        //Assign if statement and given the different conditions based on the choice of the user.  
        if(t == 'r' || t == 'R')
        {
                totalMarkups = 0;   
        }
        if(t == 'o' || t == 'O')
        {
                totalMarkups = beforeCost * 0.20;   
        }
        if(t == 'g' || t == 'G')
        {
                totalMarkups = beforeCost * 0.50;    
        }
        if(c == 'y' || c == 'Y')
        {
                totalDiscount = 0;       
        }
        if(c == 'g' || c == 'G')
        {
                totalDiscount = beforeCost * 0.10;                   
        }
        if(c == 'm' || c == 'M')
        {
                totalDiscount = beforeCost * 0.05;      
        }
        if(!(state.equalsIgnoreCase("kansas")))
        {
                totalMarkups = totalMarkups + shipping;
        }

        //Display the output from the user's choices.
        System.out.println("--------------------");
        System.out.printf("Total cost for " + numberBanana +" banana(s) before markups or discounts: $%.2f" + "\n", beforeCost);
        System.out.printf("Total markups: $%.2f\n",totalMarkups);
        System.out.printf("Total discount: $%.2f",totalDiscount);
        totalCost = beforeCost + totalMarkups - totalDiscount;
        System.out.printf("\nTotal cost: $%.2f",totalCost);
        System.out.print("\nShipping to:\n\t" + address + "\n\t" + city + "\n\t" + state + "\n\t" + zipCode);

    }


}

