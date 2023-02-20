// package OOPS.Polymorphism;

class demo1 {
    static void calculate(int a, int b){
        System.out.println("Super class method");
    }
}
class demo2 extends demo1{
    static void calculate(int a, int b){
        System.out.println("Sub class method");
    }
}
class StaticMethodOverriding{
    public static void main(String[] args) {
        // System.out.println("Creating super class object");
        // demo1 ob = new demo1();
        System.out.println("calling demo1 method");
        demo1.calculate(10, 20);
        // System.out.println("Creating sub class object");
        // demo2 ob1 = new demo2();
        System.out.println("calling demo2 method");
        demo2.calculate(20, 30);
        System.out.println("calling demo2 method using demo1 reference");
        demo1 ref = new demo2();
        ref.calculate(10, 10);
    }
}