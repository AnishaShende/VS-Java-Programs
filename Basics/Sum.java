package Basics;
import java.util.Scanner;;

public class Sum {
    public static void main(String[] args) {
        int sum = 0, j = 0, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers : ");

        //Using for loop
        // for(int j = 0; j < 5; j++){
        //     i = input.nextInt();
        //     sum += i;
        // }

        //Using while loop
        while(j < 5){
            i = input.nextInt();
            sum += i;
            j++;
        }
        System.out.println("Sum is : "+sum);
    }
}
