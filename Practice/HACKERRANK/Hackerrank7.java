import java.util.Arrays;
import java.util.Scanner;

// Java program to check if two strings are anagrams
public class Hackerrank7 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        char[] charr1 = s1.toCharArray();
        char[] charr2 = s2.toCharArray();
        Arrays.sort(charr1);
        Arrays.sort(charr2);
        if (Arrays.equals(charr1, charr2)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}