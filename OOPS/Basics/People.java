package OOPS.Basics;
// package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OriginalPeople{
    private String name;
    private int age;

    OriginalPeople(String n, int a) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Enter your name: ");
        // name = br.readLine();
        // System.out.print("Enter your age: ");
        // age = Integer.parseInt(br.readLine());
        name = n;
        age = a;
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        if (age <= 30) {
            System.out.println("You are Young");
        }
        else if (age <= 50) {
            System.out.println("You are Middle aged");
        } else {
            System.out.println("You are Old");
        }
        // br.close();
    }
    // void accept() throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     System.out.print("Enter your name: ");
    //     name = br.readLine();
    //     System.out.print("Enter your age: ");
    //     age = Integer.parseInt(br.readLine());
    //     br.close();
    // }
    // void check(){
    //     if (age <= 30) {
    //         System.out.println("Young");
    //     }
    //     else if (age <= 50) {
    //         System.out.println("Middle aged");
    //     } else {
    //         System.out.println("Old");
    //     }
    // }
}

public class People {
    public static void main(String[] args) throws IOException{

        String s = args[0];
        int i = Integer.parseInt(args[1]);
        OriginalPeople Taehyung = new OriginalPeople(s, i);
        // Taehyung.accept();
        // System.out.println("Age = "+Taehyung.age);
        // Taehyung.check();
    }
}
