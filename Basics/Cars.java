package Basics;
import java.util.Scanner;

public class Cars {
    String name;
    double price;

    public void GetCars() {
        System.out.println("Enter the car name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter the car price: ");
        price = sc.nextDouble();
        System.out.println("Name of the car is: "+name);
        System.out.println("Price of the car is: "+price);
        // sc.close();
    }

    public static void main(String[] args){
        Cars Car1 = new Cars();
        Cars Car2 = new Cars();
        Car1.GetCars();
        Car2.GetCars();
    }
}
