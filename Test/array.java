import java.io.IOException;
import java.io.*;
// package Test;

/**
 * array
 */
public class array {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println(arr1.length);
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        arr2 = arr1;
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // System.out.println(arr1.length);
    }
}