//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG2{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            // Solution ob = new Solution();
            System.out.println(Solution.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        String str = a.toString();
        int index = 0;
        String colors[] = {"R", "G", "B"};
        ArrayList<Character> arrl = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        for (int i = 0; i < arrl.length; i = i + 2) {
                for (int j = 1; j < arrl.length; j = j + 2) {
                    if (arrl.get[i] != arrl.get[j]) {
                        for (int j2 = 0; j2 < 3; j2++) {
                            if (colors[j2] == arrl.get[i] || colors[j2] == arrl.get[j]) {
                                break;
                            }
                            else{
                                System.out.println(arrl.get[index]);
                                System.out.println(colors[j2]);
                                arrl.get[index] = colors[j2];
                                index++;
                            }
                        }
                    }
                    else{
                        count ++;
                        arrl.get[index] = arrl.get[i];
                        index ++;
                    }
                }
                if(i == n - 1){
                    arrl.get[index] = arrl.get[i];
                }
            }
            for (String s : temp) {
                System.out.print(s+" ");
            }
        return arrl.length;





        // // code here
        // int index = 0;
        // int count = 0;
        // String temp[] = new String[n*2];
        // String colors[] = {"R", "G", "B"};

        // // System.out.println(arr.length);
        // // System.out.println(a.length);
        // // System.out.println(temp.length);
        // // temp[index] = "R";
        // // System.out.println(temp[index]);
        // // for (String string : temp) {
        // //     System.out.println("Hello");
        // //     System.out.println(string+" ");
        // //     System.out.println("Hello");
        // // }
        
        // for (int i = 0; i < n; i = i + 2) {
        //     for (int j = 1; j < n; j = j + 2) {
        //         if (a[i] != a[j]) {
        //             for (int j2 = 0; j2 < 3; j2++) {
        //                 if (colors[j2] == a[i] || colors[j2] == a[j]) {
        //                     break;
        //                 }
        //                 else{
        //                     System.out.println(temp[index]);
        //                     System.out.println(colors[j2]);
        //                     temp[index] = colors[j2];
        //                     index++;
        //                 }
        //             }
        //         }
        //         else{
        //             count ++;
        //             temp[index] = a[i];
        //             index ++;
        //         }
        //     }
        //     if(i == n - 1){
        //         temp[index] = a[i];
        //     }
        // }
        // for (String s : temp) {
        //     System.out.print(s+" ");
        // }
        // return count;
    }
}