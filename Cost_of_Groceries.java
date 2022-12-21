/*
Problem
Chef visited a grocery store for fresh supplies. There are NN items in the store where the ith item has a freshness value Ai and cost Bi

Chef has decided to purchase all the items having a freshness value greater than equal to XX. Find the total cost of the groceries Chef buys.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers NN and XX — the number of items and the minimum freshness value an item should have.
The second line contains NN space-separated integers, the array AA, denoting the freshness value of each item.
The third line contains NN space-separated integers, the array BB, denoting the cost of each item.

Output Format
For each test case, output on a new line, the total cost of the groceries Chef buys.


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
		int t = sc.nextInt();
		while(t-->0){
		    int in = sc.nextInt();
		    int fr = sc.nextInt();
		    int max=0;
		    int[] ar = new int[in];
		    for(int i = 0;i<in;i++){
		        ar[i]=sc.nextInt();
		    }
		    int[] arr = new int[in];
		    for(int j=0;j<in;j++){
		        arr[j]=sc.nextInt();
		    }
		    for(int i =0;i<in;i++){
		        if(ar[i] >=fr){
		            max+=arr[i];
		        }
		    }
		    
		    System.out.println(max);
		    
		}
	}
}
