/*
A monster has HH health points. Each time you hit it with a sword it loses XX health points. However, the monster always gains YY health points right before every one of your hits.

The monster is considered defeated when the number of health points it has becomes zero or less than zero. You need to find if it is possible to defeat the monster.

Input Format
The first line of the input contains a single integer TT - the number of test cases. The description of TT test cases follows.

The first line of each test case contains three space-separated integers HH, XX and YY.

Output Format
For each test case, print a single line containing one integer. That integer should be 11 if it is possible to defeat the monster and 00 otherwise.

*/

//CODE

//Use Exception handling 

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
		    long h = sc.nextLong();
		    long x = sc.nextLong();
		    long y = sc.nextLong();
		    if(x>y){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}
		    
		} catch(Exception e) {
		    return;
		}
	    
	}
}
