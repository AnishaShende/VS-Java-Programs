import java.util.Scanner;

// package EXAM;
// If we don't provide command line arguments
/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at P2.main(P2.java:7)
 */

// If we give char input rather than number in nextInt method
/*Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Scanner.java:864)
        at java.util.Scanner.next(Scanner.java:1485)
        at java.util.Scanner.nextInt(Scanner.java:2117)
        at java.util.Scanner.nextInt(Scanner.java:2076)
        at P2.main(P2.java:20) */
class P2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        int b;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        switch(b){
            case 1: System.out.println("Its 1");
                    break;
            case 2: System.out.println("Its 2");
                    break;
            default: System.out.println("Default");
                     break;
        }
        
    }
    
}
