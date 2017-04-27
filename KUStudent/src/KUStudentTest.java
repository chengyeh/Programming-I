/* -----------------------------------------------------------------------------
 *
 * File Name: KUStudentTest.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168 Lab 9
 * Description:  This program is to test KUStudent class.
 * Date: 4/14/15
 *
 ---------------------------------------------------------------------------- */
import java.util.Scanner;

public class KUStudentTest 
{
	public static void main(String[] args)
	{
		//Declare Scanner and instance
		Scanner kb = new Scanner(System.in);
		KUStudent KSU = new KUStudent();
		
		//Call set_name method and get inputs from the user.
		System.out.println("Please input the student's name (firstname lastname):");
	    KSU.set_name(kb.next(), kb.next());
	    
	    //Call set_kuinfo method and get inputs from the user.
	    System.out.println("Please input the student's KUID and department:");
	    KSU.set_kuinfo(kb.next(), kb.next());
	    System.out.println();
	    
	    //Call writeOutput method
	    writeOutput(KSU);
	}
	
	//Uses the get methods of the KUStudent class to handle the printing
	public static void writeOutput(KUStudent stu)
	{
		System.out.println("Student: " + stu.get_fname() + " " + stu.get_lname());
		System.out.println("KUID: " + stu.get_id());
		System.out.println("Department: " + stu.get_dpt());
	}

}
