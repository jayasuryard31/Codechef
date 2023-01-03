/*
Problem
You are given TT testcases , each testcase consists of 3 numbers , PP,XX,YY,ZZ.
You have a best friend named Rahul. ZZ is 11 if you will meet Rahul and 00 otherwise. You initially has an Emotional Proximity of PP, which increases by Y\%Y% if you meet Rahul and decreases by X\%X% otherwise. You have to print the final Emotional Proximity.

Input Format
First line contains TT , Number of Testcases
Now each test case contains 4 integers PP,XX,YY,ZZ
Output Format
For each testcase print one line containing a single real number - the final emotional proximity.
Your answer is considered correct if its absolute or relative error doesn't exceed 1e-6.

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
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    double p = sc.nextInt();
		    double x = sc.nextInt();
		    double y = sc.nextInt();
		    double z = sc.nextInt();
		    
		    if(z==1){
		        double k = (y/100)*p;
		        p+=k;
		    }
		    else if(z==0){
		        double k = (x/100)*p;
		        p-=k;
		        
		    }
		    System.out.println(p);
		}
	}
}
