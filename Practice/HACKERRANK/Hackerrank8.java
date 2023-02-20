import java.math.BigDecimal;
import java.util.*;
class Hackerrank8{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here

        int res;
        // String orig[] = s;
        // String tempString, a1, b1;
        // BigDecimal temp;
        BigDecimal a;
        int index;
        BigDecimal b;

        for (int i = 0; i < n; i++) {
            a = new BigDecimal(s[i]);
            index = i;
            // a1 = orig[i];
            // System.out.print("a1 = "+a1+" ");
            for (int j = i+1; j < n; j++) {
                b = new BigDecimal(s[j]);
                // b1 = orig[j];
                // System.out.print("b1 = "+b1+" ");
                // System.out.print("a = "+a+", b = "+b+"   ");
                res = a.compareTo(b);
                if (res == -1) {
                    a = b;
                    // continue;
                    index = j;
                }
                // else if(res == -1){
                //     // temp = a;
                //     // a = b;
                //     // b = temp;
                //     // tempString = a1;
                //     // a1 = b1;
                //     // b1 = tempString;
                    
                //     // System.out.print("tempString = "+tempString+" ");
                // }
                // else{
                //     continue;
                // }
                // s[j] = b.toString();
            }
            String tempString2 = s[i];
            s[i] = s[index];
            s[index] = tempString2;
            // s[i] = a.toString();
        }
        // for (int i = 0; i < orig.length; i++) {
        //     System.out.println(orig[i]);
        // }
        // System.out.println();
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}