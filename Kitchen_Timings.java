/*
Problem
The working hours of Chef’s kitchen are from Xpm to Ypm (1≤X<Y≤12).

Find the number of hours Chef works.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers X and Y — the starting and ending time of working hours respectively.
Output Format
For each test case, output on a new line, the number of hours Chef works.


*/

//CODE

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		while(u-->0){
		    int d = sc.nextInt();
		    int y = sc.nextInt();
		    System.out.println(y-d);
		}
	}
}
