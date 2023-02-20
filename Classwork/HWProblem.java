package Classwork;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class HWProblem {
    static int factorial(int num){
        if (num == 0) {
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        args = new String[] {"Hello"};
        System.out.println("Enter: ");
        args[0] = sc.nextLine();
        int count = Integer.parseInt(args[0]);
        int fact = factorial(count);
        System.out.println("Factorial of "+count+" is "+fact);
        sc.close();
        // System.out.println("Name is "+args[0]);
        // args = String[];
        // String name = "hello";
        // System.out.println("Enter: ");
        // String str = sc.nextLine();
        // HWProblem.main(args);
        // System.out.println("Hello");
        // HWProblem.main(new String[] {"main"});
        // main("args");
    }
    /* 
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a name: ");
        String name = br.readLine();
        int count = name.length();
        int fact = factorial(count);
        System.out.println("Length of "+name+" is "+count+" and factorial of "+count+" is "+fact);
    }
    */
}
