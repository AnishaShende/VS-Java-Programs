import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.*;
public class IOPractice {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        // sc.skip("\n");
        // sc.skip("\n");
        System.out.print("Enter Gender: ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Gender is: "+gender);
        InnerIOPractice.main(args);
    }
}

/**
 * InnerIOPractice
 */
class InnerIOPractice {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println();
        System.out.print("Enter another Gender: ");
        char gender1 = (char)br.read();
        br.skip(2);
        System.out.print("Enter another Name: ");
        String name1 = br.readLine();
        System.out.print("Enter another Age: ");
        int age1 = Integer.parseInt(br.readLine());

        System.out.println("Another Name is: "+name1);
        System.out.println("Another Age is: "+age1);
        System.out.println("Another Gender is: "+gender1);
    }
}