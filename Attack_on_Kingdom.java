/*
Problem
Nightking wants to attack the kingdom and he really likes cold days. However, he doesn’t want to attack the kingdom on the coldest day, because it is obvious.

Instead, he will attack the second coldest day. Given an array AA of NN distinct integers where Ai represents the temperature forecast of the ii-th day, You need to find the temperature of the day of the attack.

Input Format
First-line will contain TT, the number of test cases. Then the test cases follow.
Each test case contains two lines of input.
The first line of every test case contains an integer NN - the number of days
The second line of every test case contains NN integers - A_1,A_2,..,A_N denoting the temperature forecast of the i-th day.
Output Format
For each test case, output in a single line - the answer to the ii-th test case.


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
		 int temp=0;
		 while(t-->0){
		     int n =sc.nextInt();
		     int[] ar = new int[n];
		     for(int i=0;i<n;i++){
		         ar[i]=sc.nextInt();
		     }
		     Arrays.sort(ar);
		     System.out.println(ar[1]);
		 }
		} catch(Exception e) {
		    return;
		}
	}
}
