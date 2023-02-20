import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class StringBufferClass {
    public static void main(String[] args) throws IOException{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String a = br.readLine();
        System.out.println("Enter your middle name: ");
        String b = br.readLine();
        System.out.println("Enter your last name: ");
        String c = br.readLine();

        sb.append(a+" ");
        sb.append(c);
        int n = a.length();
        sb.insert(n, " "+b);
        System.out.println("Full name is: "+sb);
        br.close();
    }
}
