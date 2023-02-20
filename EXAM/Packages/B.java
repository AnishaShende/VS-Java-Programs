// package pack1;
// We have to comment above statement because it stores the .class file of B to another package pack
// And when we will run it we will get an error saying, Error: Could not find or load main class B
// The class in which we are using our imported classes should not be in a package 
// It's .class file must be in the same folder OR use 2nd command java pack1.B
import pack.A;
public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.addition(10, 40);
    }
}
// javacold -d . B.java OR java pack1.B
