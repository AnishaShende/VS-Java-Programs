import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Day17 {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double a, b;
        double rem1 = 0;
        double rem2 = 0;
        a = sc.nextDouble();
        b = sc.nextDouble();
        // System.out.println("a = "+a+" b = "+b);
        while(a != 0 || b != 0){
            rem1 = a % 10;
            rem2 = b % 10;
            // System.out.println("a = "+a+" b = "+b);
            // System.out.println("rem1 = "+rem1+" rem2 = "+rem2);
            if((rem1 + rem2) >= 10){
                count ++;
                break;
            }
            a /= 10;
            b /= 10;
        }
        if(count == 1){
            System.out.println("Hard");
        }
        else {
            System.out.println("Easy");
        }
    }
}