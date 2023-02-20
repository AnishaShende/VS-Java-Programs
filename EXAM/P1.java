// package EXAM;
// If we run the program without compiling or program having compilation errors
// then we will get error message - Error: Could not find or load main class P1
/*
changing final variable value we will get error message -
P1.java:9: error: cannot assign a value to final variable a
        a = 40;
        ^
1 error
 */
class P1 {
    public static void main(String[] args) {
        final int a = 10;
        int b = 20;
        System.out.println(a+b);
        b = 30;
        // a = 40;
        System.out.println(a);
        System.out.println(b);
    }
}
