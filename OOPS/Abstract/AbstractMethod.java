// package OOPS.Abstract;

// The abstract method calculate in type AbstractMethod can only be defined by an abstract class
abstract class MyClass {
    abstract void calculate(int a);
}
class sub1 extends MyClass{
    void calculate(int a){
        System.out.println("Square is "+a*a);
    }
}
class sub2 extends MyClass{
    void calculate(int a){
        System.out.println("Squareroot is "+Math.sqrt(a));
    }
}
class sub3 extends MyClass{
    void calculate(int a){
        System.out.println("Cube is "+a*a*a);
    }
}
class AbstractMethod{
    public static void main(String[] args) {
        sub1 ob1 = new sub1();
        ob1.calculate(5);
        sub2 ob2 = new sub2();
        ob2.calculate(100);
        sub3 ob3 = new sub3();
        ob3.calculate(2);
        System.out.println("\nUsing reference variable of abstract class");
        MyClass ref;
        ref = ob1;
        ref.calculate(1);
        ref = ob2;
        ref.calculate(2);
        ref = ob3;
        ref.calculate(3);
    }
}