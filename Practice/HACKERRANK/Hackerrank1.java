import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        int m = month;
        int d = day;
        int y = year;
        // calendar.set(year, month, day);
        // System.out.println("1 = " + calendar.getTime());
        calendar.set(y, m-1, d);
        System.out.println("2 = " + calendar.getTime());
        // int temp = calendar.DAY_OF_WEEK;
        int temp = calendar.get(calendar.DAY_OF_WEEK);
        System.out.println("Temp is = " + temp);
        switch(temp-1){
            case 0: 
                return "SUNDAY";
            case 1:
                return "MONDAY";
                // break;
            case 2:
                return "TUESDAY";
                // break;
            case 3:
                return "WEDNESDAY";
                // break;
            case 4:
                return "THURSDAY";
                // break;
            case 5:
                return "FRIDAY";
                // break;
            case 6:
                return "SATURDAY";
                // break;
            case 7:
                return "SUNDAY";
                // break;
            default:
                return "Invalid";
        }
        // return "Hi!";
    }

}

public class Hackerrank1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);
        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        bufferedReader.close();
        // bufferedWriter.close();
    }
}
