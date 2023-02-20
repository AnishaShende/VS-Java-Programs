import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int n, int p) throws Exception{
        // try{
        //     long res = Math.pow(Long.parseLong(n), p);
        // }
        // catch(NumberFormatException ne){
            long res = 0;
            // try {
                res = (long) Math.pow(n, p);
                if(n == 0 && p == 0){
                    // MyException me = new MyException("n and p should not be zero.");
                    // throw me;
                    throw new Exception("n and p should not be zero.");
                }
                else if(n < 0 || p < 0){
                    // MyException me = new MyException("n or p should not be negative.");
                    // throw me;
                    throw new Exception("n or p should not be negative.");
                }
                // System.out.println(res);
            // } catch (Exception e) {
            //     // System.out.println(e);
            //     // throw new Exception();
            // }
            return res;
    }
}

public class Hackerrank10 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
// class MyException extends Exception{
//     String msg;
//     MyException(String msg){
//         super(msg);
//         this.msg = msg;
//     }
// }