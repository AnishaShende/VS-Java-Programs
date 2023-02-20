// package Practicals;

public class Practical2 {
    public static void main(String[] args) {

        int large, small;
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        small = arr[0];
        large = arr[4];
        System.out.println("Largest number is "+large);
        System.out.println("Smallest number is "+small);
    }
}
