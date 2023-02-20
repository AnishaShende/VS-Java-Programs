//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG5 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.noOfOpenDoors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int noOfOpenDoors(Long N) {
        // code here
        int size = N.intValue();
        int i = size-1;
        int count = 0;
        int arr[] = new int[size];
        Arrays.fill(arr, 0);
        while (i < N) {
            arr[i] = 1;
            i = i+size-1;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == 1){
                count++;
            }
        }
        return count;
    }
};