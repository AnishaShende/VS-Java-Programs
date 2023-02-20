import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringFinder {
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers of elements in arrays: ");
        // int n = sc.nextInt();
        int n = Integer.parseInt(br.readLine());
        String str[] = new String[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            // str[i] = sc.nextLine();
            str[i] = br.readLine();
        }
        System.out.println("Enter the string to search: ");
        // String search = sc.nextLine();
        String search = br.readLine();
        for (int i = 0; i < n; i++) {
            if(str[i].equalsIgnoreCase(search)){
                System.out.println("Element found at "+(i+1)+" location!");
            }
        }
        // sc.close();
        br.close();
    }
}
