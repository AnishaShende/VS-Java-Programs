import java.util.*;
import java.text.*;

public class Hackerrank2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        scanner.close();
        
        // Write your code here.
        Locale locale1 = Locale.US;
        Currency c1 = Currency.getInstance(locale1);
        String s1 = c1.getSymbol(locale1);

        Locale locale2 = new Locale("en", "IN");
        Currency c2 = Currency.getInstance(locale2);
        String s2 = c2.getSymbol(locale2);

        Locale locale3 = Locale.CHINA;
        Currency c3 = Currency.getInstance(locale3);
        String s3 = c3.getSymbol(locale3);

        Locale locale4 = Locale.FRANCE;
        Currency c4 = Currency.getInstance(locale4);
        String s4 = c4.getSymbol(locale4);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.print("US: ");
        System.out.println(s1+formatter.format(payment));
        System.out.print("India: ");
        System.out.println(s2+formatter.format(payment));
        System.out.print("China: ");
        System.out.println(s3+formatter.format(payment));
        System.out.print("France: ");
        System.out.println(france.format(payment));
    }
}