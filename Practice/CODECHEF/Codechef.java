/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		long a, b;
		long sum = 0;
		long addres;
		int rem;
		n = Integer.parseInt(br.readLine());
		long res[] = new long[n];
		for (int i = 0; i < n; i++) {
		    // a = Integer.parseInt(br.readLine());
		    // b = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            s1 = s1.trim();
            s2 = s2.trim();
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
		    addres = a+b;
		    while(addres != 0){
		        rem = (int)addres%10;
		        switch(rem){
		            case 0:
		                sum += 6;
		                break;
		            case 1:
		                sum += 2;
		                break;
		            case 2:
		                sum += 5;
		                break;
		            case 3:
		                sum += 5;
		                break;
		            case 4:
		                sum += 4;
		                break;
		            case 5:
		                sum += 5;
		                break;
		            case 6:
		                sum += 6;
		                break;
		            case 7:
		                sum += 3;
		                break;
		            case 8:
		                sum += 7;
		                break;
		            case 9:
		                sum += 6;
		                break;
		            default:
		                break;
		        }
		        addres /= 10;
		    }
		    res[i] = sum;
            sum = 0;
		}
		for (int i = 0; i < n; i++) {
		    System.out.println(res[i]);
		}
	}
}
