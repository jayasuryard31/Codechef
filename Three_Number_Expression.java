/*
Problem
You are given TT testcases , in each testcase you are given three numbers AA, BB and CC .
Find that whether an expression of the form `` x \hspace{0.2em} A \hspace{0.2em} y \hspace{0.2em} B \hspace{0.2em} z \hspace{0.2em} C "‘‘xAyBzC" exists ( where xx , yy and zz can be ++ or -− ) , such that the final result is 00. If it exists print ``YES"‘‘YES" (without quotes), else print ``NO"‘‘NO"(without quotes).

Input Format
First line contains TT , Number of Testcases
Now each test case contains 3 integers AA,BB,CC
Output Format
For each testcase print one line consisting of ``YES"‘‘YES" or ``NO"‘‘NO" (without quotes) as described in problem.
Output is Case-Insensitive i.e. ``Yes"‘‘Yes" , ``nO"‘‘nO" , ``YeS"‘‘YeS" all will be considered correct.

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
	    try {
	        
	    
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    long c = sc.nextLong();
	    
	    if(a==b&&b==c)
	        System.out.println("NO");
	    else if(a+b==c)
	        System.out.println("YES");
	    else if(b+c==a)
	        System.out.println("YES");
	    else if(c+a==b)
	        System.out.println("YES");
	    else 
	        System.out.println("NO");
	}
	    } catch(Exception e) {
	            return;
	    }
	}
}
