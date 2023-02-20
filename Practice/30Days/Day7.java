import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Day7 {
    // static void Swap(char a, char b){
    //     char temp;
    //     temp = a;
    //     a = b;
    //     b = temp;
    // }
    public static void main (String[] args) {
        // Your code here
        int i, j;
        String res = new String();
        char temp;
        String S, T;
        char a, b;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        T = sc.next();
        StringBuffer sb = new StringBuffer(S);
        for(i = 0; i < S.length()-1; i++){
            System.out.println("sb = "+sb);
            S = sb.toString();
            // for(j = i+1; j < S.length(); j++){
            //     temp = S.charAt(i);
            //     S.charAt(i) = S.charAt(j);
            //     S.charAt(j) = temp;
            // Swap(S.charAt(i), S.charAt(i+1));
            // a = S.charAt(i);
            // b = S.charAt(i+1);
            // S.replace(a, b);
            // System.out.print("A = "+a+" b = "+b+"   ");
            // System.out.print("i = "+i+" i+1 = "+(i+1)+" ");
            temp = S.charAt(i);
            sb.setCharAt(i, S.charAt(i+1));
            sb.setCharAt(i+1, temp);
            S = sb.toString();
            System.out.println("S = "+sb);
            if(S.equals(T)){
                res = "Yes";
                break;
            }
            else {
                res = "No";
                System.out.println("S1 = "+sb);
                sb.setCharAt(i+1, S.charAt(i));
                sb.setCharAt(i, temp);
                System.out.println("S2 = "+sb);
                // S.replace(S.charAt(i), S.charAt(i+1));
            }
            // }
            // abc 
            // acb
            // S.charAt(i) = 
            // S.indexOf(S.charAt(i));
            //  S.charAt(i+1);
        }
        System.out.println(res);
    }
}