// package OOPS.Methods;

/**
 * Test
 */
public class Test2 {

    int x = 57;

    void display(){
        System.out.println("X = "+x);
    }
    public static void main(String[] args) {
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2();
        obj1.x++;
        System.out.println("After incrementing obj1 X = "+obj1.x);
        obj1.display();
        System.out.println("Value of X in obj2 is "+obj2.x);
        obj2.display();
    }
}