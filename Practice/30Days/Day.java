import java.io.*;
import java.util.*;
public class Day {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double a, b;
        double rem1 = 0;
        double rem2 = 0;
        a = sc.nextDouble();
        b = sc.nextDouble();
        int aLength = (int)(Math.log10(a)+1);
        int bLength = (int)(Math.log10(b)+1);
        boolean isHard = false;
        if (aLength == bLength) {
        for (int i = 0; i < aLength; i++) {
            int aDigit = (int)a % 10;
            int bDigit = (int)b % 10;
            if (aDigit + bDigit >= 10) {
            isHard = true;
            break;
            }
            a /= 10;
            b /= 10;
        }
        } else {
        isHard = true;
        }
        if (isHard) {
        System.out.println("Hard");
        } else {
        System.out.println("Easy");
        }
        // while(a != 0 || b != 0){
        //     rem1 = a % 10;
        //     rem2 = b % 10;
        //     if((Math.floor(rem1) + Math.floor(rem2)) >= 10){
        //         count ++;
        //         break;
        //     }
        //     a /= 10;
        //     b /= 10;
        // }
        // if(count == 1){
        //     System.out.println("Hard");
        // }
        // else {
        //     System.out.println("Easy");
        // }
    }    
}
