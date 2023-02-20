import java.io.*;
import java.util.*;

public class Terminal {
    public static void main(String[] args) throws IOException {
        int i = 0, j = 0;
        String s;
        char c = 'a';
        FileOutputStream fout = new FileOutputStream("Sample2.txt");
        // FileInputStream fin = new FileInputStream("Sample.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the file : ");
        s = sc.nextLine();
        i = s.length()-1;
        while (i != -1) {
            c = s.charAt(j);
            fout.write(c);
            i--;
            j++;
        }
        
    }
}
