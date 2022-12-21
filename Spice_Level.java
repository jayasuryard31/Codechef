/*
Problem
Each item in Chef’s menu is assigned a spice level from 11 to 1010. Based on the spice level, the item is categorised as:

MILD: If the spice level is less than 4.
MEDIUM: If the spice level is greater than equal to 4 but less than 7.
HOT: If the spice level is greater than equal to 7.
Given that the spice level of an item is X, find the category it lies in.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of an integer X — the spice level of the item.
Output Format
For each test case, output on a new line, the category that the item lies in.

You may print each character in uppercase or lowercase. For example, HOT, hot, Hot, and hOT are all considered the same.


*/

//CODE

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		while(s-->0){
		    int c = sc.nextInt();
		    if(c<4){
		        System.out.println("MILD");
		    }
		    else if(c>=4 && c<7){
		        System.out.println("MEDIUM");
		    }
		    else{
		        System.out.println("HOT");
		    }
		}
	}
}

