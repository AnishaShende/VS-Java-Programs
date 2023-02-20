import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Wrapper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter integer: ");
        int i = Integer.parseInt(br.readLine());
        System.out.print("Enter Byte: ");
        byte b = Byte.parseByte(br.readLine());
        System.out.print("Enter Short: ");
        short s = Short.parseShort(br.readLine());
        System.out.print("Enter Long: ");
        long l = Long.parseLong(br.readLine());
        System.out.print("Enter Float: ");
        Float f = Float.parseFloat(br.readLine());
        System.out.print("Enter Double: ");
        Double d = Double.parseDouble(br.readLine());
        System.out.print("Enter Boolean: ");
        Boolean bl = Boolean.parseBoolean(br.readLine());
        
        System.out.println("Integer is: "+i);
        System.out.println("Byte is: "+b);
        System.out.println("Short is: "+s);
        System.out.println("Long is: "+l);
        System.out.println("Float is: "+f);
        System.out.println("Double is: "+d);
        System.out.println("Boolean is: "+bl);
    }
}
