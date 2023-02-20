// package Classwork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primes {
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
        int count = 0;
        int num = 2;
        while(count < n){
            boolean res = Prime(num);
            if (res == true) {
                count++;
                System.out.print(num+" ");
            }
            num++;
    }
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("Enter the number of Prime number to generate: ");
        num = Integer.parseInt(br.readLine());
        Primes.generate(num);
    }
}
