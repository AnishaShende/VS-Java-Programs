package Basics;
public class Loops {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 7, 8, 0, 9};
        for(int num: numbers){
            System.out.println("Number "+num);
        }
        System.out.println();
        for(int i = 0; i < 6; i++){
            System.out.println("Number "+i+" = "+numbers[i]);
        }
    }
}
