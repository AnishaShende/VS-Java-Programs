// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

public class Practical3 {
    static boolean Prime(int i){
        int flag = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag++;
                }
            }
            if (flag == 0) {
                return true;
            }
            else{
                flag = 0;
                return false;
            }
    }
    static void generate(int n){
        int num = 2;
        while(num != n){
            boolean res = Prime(num);
            if (res == true) {
                System.out.print(num+" ");
            }
            num++;
    }
        System.out.println();
    }
    public static void main(String[] args){
        int num;
        num = Integer.parseInt(args[0]);
        Practical3.generate(num);
    }
}
