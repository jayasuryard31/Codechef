/*
Problem
A positive integer XX is called lucky if it has an even power of 22 in its prime factorization. More formally, let pp be the largest integer such that XX is divisible by 2^p2 
p
 . Then XX is a lucky number if and only if pp is divisible by 22.

You are given a positive integer NN. Find if it is a lucky number.

Input Format
The first line of the input contains a single integer TT - the number of test cases. The description of TT test cases follows.

The first line of each test case contains a single integer NN.

Output Format
For each test case, print a single line containing one integer. That integer should be 11 if NN is a lucky number and 00 otherwise.

*/

// CODE

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
	    	int t = sc.nextInt();
		    int c = 0;
		    while(t-->0){
	        long  x = sc.nextLong();
	        int i=0;
	        while(x%2==0){
	            x/=2;
	            i++;
	        }
	        if(i%2==0)
	            System.out.println(1);
	        else 
	            System.out.println(0);
    	 
		} 
	}
}
