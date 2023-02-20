import java.util.Scanner;

public class Hackerrank5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // String[] str = s.split("\\s");
        // String[] str = s.split("[A-Za-z !, ?._'@]+");
        s = s.trim();
        if(s.length() == 0){
            System.out.println("0");
        }
        else{
            String[] str = s.split("[,'!_\\s\\n ?.@]+");
            System.out.println(str.length);
            for (String i : str) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
