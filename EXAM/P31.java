import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

// package EXAM;

class P31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, flag = 0;
        for (int i = 2; i < 1000; i++) {
            flag = 0;
            for(int j = 2; j <= i/2; j++){
                if(i%j==0){
                    flag ++;
                }
            }
            if(flag == 0){
                count ++;
                System.out.print(i+" ");
            }
            if(count == num){
                break;
            }
        }
        System.out.println();
    }
}
