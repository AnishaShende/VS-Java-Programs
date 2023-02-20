package pack1; 

public class A {
static int a; 
static public int b; 
static private int c;
static protected int d;

    public static void Demo(){
        a=1;
        b=2;
        c=3;
        d=4;
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}