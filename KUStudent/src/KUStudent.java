/* -----------------------------------------------------------------------------
 *
 * File Name: KUStudent.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168 Lab 9
 * Description:  This program sets the information about the student's first name and last name as well as the KUID and Dept.
 * Date: 4/14/15
 *
 ---------------------------------------------------------------------------- */
public class KUStudent 
{
	//Declare instance variables
	private String stud_fname;
	private String stud_lname;
	private String stud_kuid;
	private String stud_dpt;
	
	//Set student's name
	public void set_name(String fname, String lname)
	{
		stud_fname = fname;
		stud_lname = lname;
	}
	
	//Set student's KUID and Department
	public void set_kuinfo(String kuid, String dpt)
	{
		stud_kuid = kuid;
		stud_dpt = dpt;
	}
	
	//Get student's first name
	public String get_fname()
	{
		return (stud_fname);
	}
	
	//Get student's last name
	public String get_lname()
	{
		return (stud_lname);
	}
	
	//Get student's id
	public String get_id()
	{
		return (stud_kuid);
	}
	
	//Get student's Department
	public String get_dpt()
	{
		return (stud_dpt);
	}
	
	
}
