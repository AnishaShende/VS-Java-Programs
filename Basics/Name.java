package Basics;
import java.util.Scanner;;

public class Name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        String s, w;
        System.out.println("Enter your name : ");
        s = sc.nextLine();
        System.out.println("s = "+s);
        System.out.println("Enter a number : ");
        a = sc.nextInt();
        System.out.println("a = "+a);
        // System.out.println("Enter a word : ");
        // w = sc.next();
        // System.out.println("w = "+w);
    }
}
