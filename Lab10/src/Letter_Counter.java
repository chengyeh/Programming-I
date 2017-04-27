/* -----------------------------------------------------------------------------
 *
 * File Name: Letter_Counter.java
 * Author: Cheng Yeh Lee chengyeh@ku.edu
 * Assignment:   EECS-168 Lab 10
 * Description:  This program will accept a filename from the user that indicates the input file. The program then reads the file and reports how many of each letter are there in the file.
 * Date: 4/24/15
 *
 ---------------------------------------------------------------------------- */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Letter_Counter 
{
	public static void main(String[] args)
	{
		//Declare the Scanner and variables
		Scanner kb = new Scanner(System.in);
		String in = "input.txt";
		String out;
		FileReader myFileReader = null;
		BufferedReader myBufferedReader = null;
		FileWriter myFileWriter = null;
		BufferedWriter myBufferedWriter = null;
		
		int cA = 0;
		int cB = 0;
		int cC = 0;
		int cD = 0;
		int cE = 0;
		int cF = 0;
		int cG = 0;
		int cH = 0;
		int cI = 0;
		int cJ = 0;
		int cK = 0;
		int cL = 0;
		int cM = 0;
		int cN = 0;
		int cO = 0;
		int cP = 0;
		int cQ = 0;
		int cR = 0;
		int cS = 0;
		int cT = 0;
		int cU = 0;
		int cV = 0;
		int cW = 0;
		int cX = 0;
		int cY = 0;
		int cZ = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int t = 0;
		int u = 0;
		int v = 0;
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int flag = 0;
		
		//Use while loop to continuous ask user when they input invalid filename
		while(flag == 0)
		{
			try
			{	
				//Read file
			    System.out.print("Input a file name: ");
				myFileReader = new FileReader(kb.nextLine());
				flag = 1;
				//Read lines im the file
				myBufferedReader = new BufferedReader(myFileReader);
				String line = myBufferedReader.readLine();
				String allLine = "";
				while(line != null)
				{
					allLine = allLine + "\n" + line;
					line = myBufferedReader.readLine();	
				}
				//Counting letter in the file
				for(int number = 0; number < allLine.length(); number++)
				{
					
					if(allLine.charAt(number) == 'A')
					{
						cA++;
					}
					else if(allLine.charAt(number) == 'B')
					{
						cB++;
					}
					else if(allLine.charAt(number) == 'C')
					{
						cC++;
					}
					else if(allLine.charAt(number) == 'D')
					{
						cD++;
					}
					else if(allLine.charAt(number) == 'E')
					{
						cE++;
					}
					else if(allLine.charAt(number) == 'F')
					{
						cF++;
					}
					else if(allLine.charAt(number) == 'G')
					{
						cG++;
					}
					else if(allLine.charAt(number) == 'H')
					{
						cH++;
					}
					else if(allLine.charAt(number) == 'I')
					{
						cI++;
					}
					else if(allLine.charAt(number) == 'J')
					{
						cJ++;
					}
					else if(allLine.charAt(number) == 'K')
					{
						cK++;
					}
					else if(allLine.charAt(number) == 'L')
					{
						cL++;
					}
					else if(allLine.charAt(number) == 'M')
					{
						cM++;
					}
					else if(allLine.charAt(number) == 'N')
					{
						cN++;
					}
					else if(allLine.charAt(number) == 'O')
					{
						cO++;
					}
					else if(allLine.charAt(number) == 'P')
					{
						cP++;
					}
					else if(allLine.charAt(number) == 'Q')
					{
						cQ++;
					}
					else if(allLine.charAt(number) == 'R')
					{
						cR++;
					}
					else if(allLine.charAt(number) == 'S')
					{
						cS++;
					}
					else if(allLine.charAt(number) == 'T')
					{
						cT++;
					}
					else if(allLine.charAt(number) == 'U')
					{
						cU++;
					}
					else if(allLine.charAt(number) == 'V')
					{
						cV++;
					}
					else if(allLine.charAt(number) == 'W')
					{
						cW++;
					}
					else if(allLine.charAt(number) == 'X')
					{
						cX++;
					}
					else if(allLine.charAt(number) == 'Y')
					{
						cY++;
					}
					else if(allLine.charAt(number) == 'Z')
					{
						cZ++;
					}
					else if(allLine.charAt(number) == 'a')
					{
						a++;
					}
					else if(allLine.charAt(number) == 'b')
					{
						b++;
					}
					else if(allLine.charAt(number) == 'c')
					{
						c++;
					}
					else if(allLine.charAt(number) == 'd')
					{
						d++;
					}
					else if(allLine.charAt(number) == 'e')
					{
						e++;
					}
					else if(allLine.charAt(number) == 'f')
					{
						f++;
					}
					else if(allLine.charAt(number) == 'g')
					{
						g++;
					}
					else if(allLine.charAt(number) == 'h')
					{
						h++;
					}
					else if(allLine.charAt(number) == 'i')
					{
						i++;
					}
					else if(allLine.charAt(number) == 'j')
					{
						j++;
					}
					else if(allLine.charAt(number) == 'k')
					{
						k++;
					}
					else if(allLine.charAt(number) == 'l')
					{
						l++;
					}
					else if(allLine.charAt(number) == 'm')
					{
						m++;
					}
					else if(allLine.charAt(number) == 'n')
					{
						n++;
					}
					else if(allLine.charAt(number) == 'o')
					{
						o++;
					}
					else if(allLine.charAt(number) == 'p')
					{
						p++;
					}
					else if(allLine.charAt(number) == 'q')
					{
						q++;
					}
					else if(allLine.charAt(number) == 'r')
					{
						r++;
					}
					else if(allLine.charAt(number) == 's')
					{
						s++;
					}
					else if(allLine.charAt(number) == 't')
					{
						t++;
					}
					else if(allLine.charAt(number) == 'u')
					{
						u++;
					}
					else if(allLine.charAt(number) == 'v')
					{
						v++;
					}
					else if(allLine.charAt(number) == 'w')
					{
						w++;
					}
					else if(allLine.charAt(number) == 'x')
					{
						x++;
					}
					else if(allLine.charAt(number) == 'y')
					{
						y++;
					}
					else if(allLine.charAt(number) == 'z')
					{
						z++;
					}
				}
				

				//Create a output file
			    System.out.print("\nInput an out file name: ");
			    out = kb.nextLine();
				myFileWriter = new FileWriter(out);
				myBufferedWriter = new BufferedWriter(myFileWriter);
				
				System.out.println("\nReading from " + in + "\n");
				System.out.print(allLine);
				
				//Write in the output file
				myBufferedWriter.write("A=" + cA + "\nB=" + cB + "\nC=" + cC + "\nD=" + cD + "\nE=" + cE + "\nF=" + cF + "\nG=" + cG + "\nH=" + cH
						               + "\nI=" + cI + "\nJ=" + cJ + "\nK=" + cK + "\nL=" + cL + "\nM=" + cM + "\nN=" + cN + "\nO=" + cO + "\nP=" + cP
						               + "\nQ=" + cQ + "\nR=" + cR + "\nS=" + cS+ "\nT=" + cT + "\nU=" + cU + "\nV=" + cV + "\nW=" + cW+ "\nX=" + cX
						               + "\nY=" + cY + "\nZ=" + cZ + "\na=" + a + "\nb=" + b + "\nc=" + c + "\nd=" + d + "\ne=" + e + "\nf=" + f + "\ng=" + g + "\nh=" + h
						               + "\ni=" + i + "\nj=" + j + "\nk=" + k + "\nl=" + l + "\nm=" + m + "\nn=" + n + "\no=" + o + "\np=" + p
						               + "\nq=" + q + "\nr=" + r + "\ns=" + s + "\nt=" + t + "\nu=" + u + "\nv=" + v + "\nw=" + w + "\nx=" + x
						               + "\ny=" + y + "\nz=" + z);
				myBufferedWriter.close();
				System.out.println("\nResults stored in " + out);
			}
			//Catch error
			catch (Exception error)
			{
				System.out.println("Error: " + error.getMessage());
				flag = 0;
			}
	
		}
			
				
			
	}

}
