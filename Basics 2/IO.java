import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
// import java.lang.*;
import java.io.*;

public class IO{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.println("Name is: "+name);
        InnerIO.main(args);
    }
}

/**
 * InnerIO
 */
class InnerIO {

    public static void main(String[] args) {
        System.err.print("Enter another name: ");
        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        System.err.println("Another name is: "+name2);
        sc.close();
    }
}