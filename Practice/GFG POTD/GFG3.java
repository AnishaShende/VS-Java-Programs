//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG3 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int N){
        // code here
        int count = 0;
        int flag = 0;
        for (int i = 1; i <= N; i++) {
            flag = 0;
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0){
                    flag++;
                }
            }
            if(flag == 0){
                count++;
            }
        }
        int arr[] = new int[count];
        count = 0;
        for (int i = 1; i <= N; i++) {
            flag = 0;
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0){
                    flag++;
                }
            }
            if (flag == 0) {
                arr[count] = i;
                count++;
            }
        }
        //////////////////////
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        //////////////////////
        count = 0;
        int len = (arr.length * (arr.length+1) / 2) - arr.length;
        int sumarr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sumarr[count] = arr[i]+arr[j];
                count++;
            }
        }
        //////////////////////
        // for (int i = 0; i < sumarr.length; i++) {
        //     System.out.print(sumarr[i]+" ");
        // }
        //////////////////////
        int found = 0;
        for (int i = 0; i < sumarr.length; i++) {
            if (sumarr[i] == N) {
                found = 1;
                break;
            }
        }
        if(found == 1){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}