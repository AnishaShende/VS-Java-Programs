//{ Driver Code Starts
    import java.io.*;
    import java.util.*;

import org.omg.CORBA.FREE_MEM;
    
    class GFG4 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                //br.readLine();
                String s;
                s = br.readLine();
                
                Solution obj = new Solution();
                int res = obj.beautySum(s);
                
                System.out.println(res);
                
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public static int beautySum(String s) {
            // code here
            int beauty = 0;
            int freq = 0;
            String arr[] = new String[s.length()*(s.length()+1)*2];
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i+1; j < s.length(); j++) {
                    arr[count] = s.substring(i, j);
                    count++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (ch == arr[i].charAt(j)) {
                          freq++;      
                    }
                }
            }
            return beauty;
        }
    }
            
    