//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG1 {
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String S = read.readLine();
                int K = Integer.parseInt(read.readLine());
    
                Solution ob = new Solution();
                System.out.println(ob.countOfSubstrings(S,K));
            }
        }
    }
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    class Solution {
        public static String removeDuplicates(String str)   
    {   
        //Create an empty string   
        String newstr = new String(); 
        // String str;
        //calculate length of the original string  
        int length = str.length();   
            
        // Traverse the string and check for the repeated characters   
        for (int i = 0; i < length; i++)    
        {   
            // store the character available at ith index in the string  
            char charAtPosition = str.charAt(i);   
                
            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }   
        }   
        //Print string after removing duplicate characters   
        // System.out.println(newstr);
        return newstr;
    } 
        static int countOfSubstrings(String S, int K) {
            // code here
            int distinct = K-1;
            // int numcount = 1;
            int answer = 0;
            // char tempchar;
            int size = S.length() * (S.length() + 1) / 2;
            String[] subString = new String[size];
            int counter = 0;
            // System.out.println(size);
            for (int i = 0; i < S.length(); i++) {
                for (int j = i+1; j < S.length()+1; j++) {
                    subString[counter] = S.substring(i, j);
                    counter ++;
                }
            }
            // for (int i = 0; i < subString.length; i++) {
            //     // System.out.print(subString[i]+" ");
            //     // System.out.print(subString[i].length());
            // }
            // System.out.println(subString.length);
            for (int i = 0; i < subString.length; i++) {
                // System.out.println();
                if (subString[i].length() == K) {
                    // System.out.print(subString[i]+" ");
                    // for (int j = 0; j < subString[i].length(); j++) {
                    //     // for (int l = j+1; l < subString[i].length(); l++) {
                    //     //     // tempchar = subString[i].charAt(0);
                    //     //     // System.out.print("numcount at "+subString[i].charAt(j)+"-"+subString[i].charAt(l)+" = "+numcount+" ");
                    //     //     if (subString[i].charAt(j) == subString[i].charAt(l)) {
                    //     //         numcount++;
                    //     //     }
                    //     // }
                    //     // removeDuplicates(subString[i]);
                    //     // System.out.println("Out now");

                    //     //## rdsau dsaug saugu augup

                    //     // 5 distinct = 1 numcount // 2 numcount = 5-2-1==2 num 1=5d, num2=3d
                    //     // tempchar = subString[i].charAt(0);
                    //     // System.out.print("tempchar = "+tempchar+" ");
                    //     // if (tempchar != subString[i].charAt(j)) {
                    //     //     numcount++;
                    //     // }
                    // }
                    // removeDuplicates(subString[i]);
                    // if(K-numcount+1 == distinct){
                    if(removeDuplicates(subString[i]).length() == distinct){
                    answer++;
                    }
                    // numcount = 1;
                }
            }
            return answer;
        }
    };


///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////#### Well Done Anisha! You da best, girl! <<<<33 ####////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////