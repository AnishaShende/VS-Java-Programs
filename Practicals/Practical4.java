import java.io.*;

// Class Palindrome
public class Practical4 {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        String str = args[0];
        // System.out.println("Enter a String: ");
        // String str = br.readLine();
        temp = str;
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        str = sb.toString();
        if (temp.equalsIgnoreCase(str)) {
            System.out.println("String "+temp+" is a Palindrome String.");            
        }
        else{
            System.out.println("It is not a Palindrome string.");
        }
    }
}
