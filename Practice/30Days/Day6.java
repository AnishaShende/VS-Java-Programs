import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Day6 {
    public static void main (String[] args) {
        // Your code here
        int a, b, c;
        int count = 0;
        int N, K;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        for(a = 1; a <= N; a ++){
            for(b = 1; b <= N; b ++){
                for(c = 1; c <= N; c ++){
                    if(((a+b)%K==0)&&((b+c)%K==0)&&((c+a)%K==0)){
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}