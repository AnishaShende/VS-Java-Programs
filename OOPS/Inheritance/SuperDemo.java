class SuperClass {
    int num = 57;
    void display(){
        System.out.println("Super class method");
    }
}
class SubClass extends SuperClass{
    int num = 157;
    void display(){
        System.out.println("Sub class method");
        System.out.println("Super class num = "+super.num);
        System.out.print("Super class display is ");
        super.display();
    }
}
class SuperDemo{
    public static void main(String[] args) {
        System.out.println("Creating super class object");
        SuperClass obj = new SuperClass();
        System.out.println("Super class num is "+obj.num);
        System.out.print("Super class display ");
        obj.display();
        System.out.println();
        System.out.println("Creating sub class object");
        SubClass obj1 = new SubClass();
        System.out.println("Super class num is "+obj1.num);
        System.out.print("Super class display ");
        obj1.display();
        System.out.println();
        System.out.println("Sub class num is "+obj1.num);
        System.out.print("Sub class display ");
        obj1.display();
    }
}