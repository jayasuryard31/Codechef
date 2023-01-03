/*
Problem
Rubik’s cube has six sides in colors: white, blue, green, yellow, red, and orange. A liter of paint costs X_1, X_2, X_3, X_4, X_5, X_6
  dollars for each color. Each side of the cube needs half a liter of paint to be painted. How much will you pay for coloring NN unpainted cubes?

Input Format
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains 7 integers NN - number of unpainted cubes and X_1, X_2, X_3, X_4, X_5, X_6
  - cost in dollars for each color.
Output Format
For each test case, output a single line containing one integer - Total cost of coloring the cube


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
		    long sum=0;
		    int n = sc.nextInt();
		    for(int i = 0;i<6;i++){
		        long x = sc.nextInt();
		        sum+=x;
		    }
		    if(n%2==0){
		        int y = n/2;
		        
		    System.out.println(sum*y);
		    }
		    else{
		        int y =(n+1)/2;
		        System.out.println(sum*y);
		        
		    }
		}
	    } catch(Exception e) {
	        return;
	    }
	}
}
