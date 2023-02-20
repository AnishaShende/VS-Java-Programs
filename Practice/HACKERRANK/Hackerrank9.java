import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Hackerrank9 {

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int x = Integer.parseInt(br.readLine());
        // int y = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        // sc.close();
        int res;
        // try{
        //     int x = Integer.parseInt(br.readLine());
        //     int y = Integer.parseInt(br.readLine());
        // }
        // catch(IOException ie){
            
        // }
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            res = x/y;
            System.out.println(res);
        }
        catch(ArithmeticException ar){
            System.out.println(ar);
        }
        catch(InputMismatchException ie){
            System.out.println(ie.getClass().toString().replaceFirst("class ", ""));
        }
        catch(NumberFormatException nf){
            System.out.println(nf);
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}