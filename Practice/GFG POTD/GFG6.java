//{ Driver Code Starts
    import java.util.*;

import javax.lang.model.type.ArrayType;

import java.lang.*;
    import java.io.*;
    
    class Main{
        static BufferedReader br;
        static PrintWriter ot;
        public static void main(String[] args) throws IOException{
            
            br = new BufferedReader(new InputStreamReader(System.in));
            ot = new PrintWriter(System.out);
    
            int t = Integer.parseInt(br.readLine());
    
            while(t-->0){
                
                String s[] = br.readLine().trim().split(" ");
                
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                int a[] = new int[n];
                s = br.readLine().trim().split(" ");
                for(int i = 0; i < n; i++)
                    a[i] = Integer.parseInt(s[i]);
                GFG6 obj = new GFG6();
                ArrayList<Integer> res = obj.subarraySum(a, n, k);
                for(int ii = 0;ii<res.size();ii++)
                    ot.print(res.get(ii) + " ");
                ot.println();
            }
            ot.close();
        }
    
    }
    // } Driver Code Ends
    
    
    class GFG6
    {
        //Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
        {
            // Your code here
            int count = 0;
            ArrayList<Integer> arrli = new ArrayList<Integer>(2);
            int res[] = new int[arr.length];
            for(int i = 0; i < arr.length; i ++){
                
                for(int j = i+1; j < arr.length; j ++){
                    res = Arrays.copyOfRange(arr, i, j);
                    for(int k = i; k < j; k++){
                        count += res[k];
                    }
                    if(count == s){
                        arrli.add(i);
                        arrli.add(j);
                        return arrli;
                    }
                }

            }
                arrli.add(-1);
                return arrli;
        }
    }