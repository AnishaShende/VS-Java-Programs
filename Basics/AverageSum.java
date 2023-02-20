package Basics;
import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {

        double sum = 0.0;
        double average = 0.0;
        double[] array = new double[5];

        System.out.println("Enter the 5 elements of array : ");
        Scanner sc  = new Scanner(System.in);
        
        for(int i = 0; i < 5; i ++){
            array[i] = sc.nextInt();
            sum += array[i];
        }

        average = sum/2;
        System.out.println("Sum of elements of array is : "+sum);
        System.out.println("Average of elements of array is : "+average);
        
    }
}
