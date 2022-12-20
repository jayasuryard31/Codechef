/*
There is an ATM machine. Initially, it contains a total of KK units of money. NN people 
(numbered 11 through NN) want to withdraw money; for each valid i, the ii-th person wants to withdraw Ai units 
of money.

The people come in and try to withdraw money one by one, in the increasing order of their 
indices. Whenever someone tries to withdraw money, if the machine has at least the required amount 
of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything;
in that case, this person will return home directly without trying to do anything else.

For each person, determine whether they will get the required amount of money or not.

Input
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains two space-separated integers NN and KK.
The second line contains NN space-separated integers A1,A2,…,AN
Output
For each test case, print a single line containing a string with length NN. For each valid ii, 
the ii-th character of this string should be '1' if the ii-th person will successfully withdraw their money or 
'0' otherwise.

Explanation:
Example case 1: The ATM machine initially contains 1010 units of money.
The first person comes and withdraws 33 units, so the amount remaining in the machine is 77.
Then the second person withdraws 55 units and the remaining amount is 22. The third person wants to withdraw 33 units, 
but since there are only 22 units of money in the machine, it throws an error and the third person must leave without getting anything. 
Then the fourth person withdraws 22 units, which leaves nothing in the machine, so the last person does not get anything.

Example case 2: The ATM machine initially contains 66 units of money,
so it cannot give anything to the first and second person. When the third person comes, 
it gives them all the money it has, so the last person does not get anything either.
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
		int t=sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    for(int i =0; i<n;i++){
		        int d = sc.nextInt();
		        if(k>=d){
		            k = k-d;
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		      
		    }
		    System.out.println();
		}
	}
}



