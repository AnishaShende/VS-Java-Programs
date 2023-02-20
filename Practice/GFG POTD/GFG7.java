//{ Driver Code Starts
// Initial Template for Java
// LCM Triplet
import java.io.*;
import java.util.*;

class GFG7 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.lcmTriplets(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long lcmTriplets(long N) {
        // code here
        int n = Math.toIntExact(N);
        int arr[] = new int[1000];
        int large = 0;
        int count = 0;
        // for(int i = 0; i < n; i++){
        //     arr[i] = i*(i+1)*(i+2);
        //     if(i == 2){
        //         large = 2;
        //     }
        //     if(i == n-2){
        //         break;
        //     }
        // }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int j2 = j+1; j2 < n; j2++) {
                    arr[count] = i*j*j2;
                    count ++;
                    if(i == n-2){
                        break;
                    }
                }
            }
        }
        Arrays.sort(arr);
        large = arr[arr.length-1];
        // for(int j = 0; j < arr.length; j++){
        //     for(int k = j+1; k < arr.length-1; k++){
        //         if(arr[j] < arr[k]){
        //             large = arr[k];
        //         }
        //     }
        // }
        return large;
    }
}