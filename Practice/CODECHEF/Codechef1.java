/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef1
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		for(int row = 1; row <= n; row++){
		    for(int col = 1; col <= row; col++){
		        System.out.print(col);
		    }
		    for(int col = row-1; col >= 1; col--){
		        System.out.print(col);
		    }
		    System.out.println();
		}
	}
}
