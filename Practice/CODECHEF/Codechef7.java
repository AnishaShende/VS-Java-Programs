import java.io.*;
import java.util.*;

class Codechef7{
    
    static int GCD(int a, int b)
    {
        int gcd = 1; 
        for(int i = 1; i <= a && i <= b; i++){
            if(a%i==0 && b%i==0)
            gcd = i;  
        }
        return gcd;
    }
    static int LCM(int a, int b)
    {
        int lcm = (a * b) / GCD(a, b);
        return lcm;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        int num, count = 0;
        String s1;
        int countarr[] = new int[n];

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            int arr1[] = new int[num];
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            for (int j = 0; j < num; j++) {
                    s1 = st.nextToken();
                    s1 = s1.trim();
                    int a = Integer.parseInt(s1);
                    arr1[j] = a;
                }
            for (int j = 0; j < num; j++) {
                for (int j2 = j+1; j2 < num; j2++) {
                    if (GCD(arr1[j], arr1[j2]) == LCM(arr1[j], arr1[j2])) {
                        count ++;
                    }
                }
            }
            countarr[i] = count;
            count = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(countarr[i]);
        }
    }
}