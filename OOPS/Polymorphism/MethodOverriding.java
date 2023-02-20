// package OOPS.Polymorphism;

class demo1 {
    void calculate(int a, int b){
        System.out.println("Super class method");
    }
}
class demo2 extends demo1{
    void calculate(int a, int b){
        System.out.println("Sub class method");
    }
}
class MethodOverriding{
    public static void main(String[] args) {
        System.out.println("Creating super class object");
        demo1 ob = new demo1();
        ob.calculate(10, 20);
        System.out.println("Creating sub class object");
        demo2 ob1 = new demo2();
        ob1.calculate(20, 20);
        System.out.println("Super class reference refers to sub class object");
        demo1 ref = new demo2();
        ref.calculate(100, 200);
        // System.out.println("Calling method using super class reference");
        // demo1 ref1;
        // ref1.calculate(100, 200);
        // System.out.println("Calling method using sub class reference");
        // demo2 ref2;
        // ref2.calculate(300, 400);
    }
}