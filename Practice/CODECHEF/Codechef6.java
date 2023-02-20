import java.io.*;
import java.util.*;

class Codechef6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        String res[] = new String[1000];
        int A, X, Y, B;
        double Alice, Bob;
        String ans = "Alice";
        
        for (int i = 0; i < n; i++) {
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                String s3 = st.nextToken();
                String s4 = st.nextToken();
                s1 = s1.trim();
                s2 = s2.trim();
                s3 = s3.trim();
                s4 = s4.trim();
                A = Integer.parseInt(s1);
                X = Integer.parseInt(s2);
                B = Integer.parseInt(s3);
                Y = Integer.parseInt(s4);
                Alice = (double)A/X;
                Bob = (double)B/Y;
                if(Alice > Bob){
                    ans = "Alice";
                }
                else if(Alice < Bob){
                    ans = "Bob";
                }
                else if(Alice == Bob){
                    ans = "Equal";
                }
                res[i] = ans;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
