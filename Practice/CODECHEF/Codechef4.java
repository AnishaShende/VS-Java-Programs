import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Codechef4 {

    public static boolean isSorted(int[] a)
    {
        if (a == null || a.length <= 1) {
            return true;
        }
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    static String Algorithm(int A[], int n){
        int B[] = new int[n];
        int C[] = new int[n];
        int temp[] = new int[n];
        // int sorted[] = new int[n];
        int lastEle;
        int ntemp = n;
        int num;
        int count;
        count = B.length;
        while (n > 0) {
            
            lastEle = A[A.length-1];
            temp = Arrays.copyOf(A, A.length-1);
            A = temp;
            if ((B.length-count) % 2 == 0) {
                B[(B.length-count)/2] = lastEle;
            }
            else{
                num = ((B.length-count)/2);
                if(B[num] < lastEle){
                    for(int i = B.length-count; i > num+1; i--){
                        B[i] = B[i-1];
                    }
                    B[num+1] = lastEle;
                }
                else{
                    for(int i = B.length-count; i > num; i--){
                        B[i] = B[i-1];
                    }
                    B[num] = lastEle;
                }
            }
            count--;
            n --;
        }
        count = C.length;
        while (ntemp > 0) {
            
            lastEle = B[B.length-1];
            temp = Arrays.copyOf(B, B.length-1);
            B = temp;
            if ((C.length-count) % 2 == 0) {
                C[(C.length-count)/2] = lastEle;
            }
            else{
                num = ((C.length-count)/2);
                // if(C[num] < lastEle){
                //     C[num+1] = lastEle;
                // }
                // else{
                //     C[num] = lastEle;
                // }
                if(C[num] < lastEle){
                    for(int i = C.length-count; i > num+1; i--){
                        C[i] = C[i-1];
                    }
                    C[num+1] = lastEle;
                }
                else{
                    for(int i = C.length-count; i > num; i--){
                        C[i] = C[i-1];
                    }
                    C[num] = lastEle;
                }
            }
            count--;
            ntemp --;
        }
        // sorted = C;
        // Arrays.sort(sorted);
        //Arrays.sort(sorted) == C
        if(isSorted(C)){
            return "YES";
        }
        else{
            return "NO";
        }
        // for (int i = 0; i < n; i++) {
        //     if
        // }
    }
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int arrn;
        n = Integer.parseInt(br.readLine());
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            arrn = Integer.parseInt(br.readLine());
            int temparr[] = new int[arrn];
            for (int j = 0; j < arrn; j++) {
                temparr[j] = Integer.parseInt(br.readLine());
            }
            // for(int k = 0; k < arrn; k ++){
            //     System.out.print(temparr[k] + " ");
            // }
            str[i] = Algorithm(temparr, arrn);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}
