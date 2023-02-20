import java.util.Scanner;
// Java Substring Comparison

class HACKERRANK6 {

    static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int size = s.length() * (s.length() + 1) / 2;
        String[] sarr = new String[size];
        int num = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                sarr[count] = s.substring(i, j);
                count ++;
            }
        }
        
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i].length() == k) {
                num++;                
            }
        }

        count = 0;
        String[] array = new String[num];
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i].length() == k) {
                array[count] = sarr[i];            
                count ++;
            }
        }

        String temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        smallest = array[0];
        largest = array[num-1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}