import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        System.out.println("Enter a String: ");
        String str = br.readLine();
        temp = str;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        if (temp.equalsIgnoreCase(str)) {
            System.out.println("String "+str+" is a Palindrome String.");            
        }
        else{
            System.out.println("It is not a Palindrome string.");
        }
    }
}
