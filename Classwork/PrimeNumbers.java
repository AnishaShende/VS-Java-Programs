package Classwork;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to display: ");
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        int limit = 1000;
        int flag = 0;
        while (count != n) {
            // int i = 2;
            for (int j = 2; j <= limit; j++) {
                for (int j2 = 2; j2 <= j/2; j2++) {
                    if (j % j2 == 0) {
                        flag++;
                    }
                }
                if (flag == 0) {
                    System.out.print(j+" ");
                    count++;
                }
                else if(count == n){
                    break;
                }
                flag = 0;
            }
            System.out.println();
        }
        sc.close();
    }
}
