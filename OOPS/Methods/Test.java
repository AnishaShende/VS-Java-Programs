// package OOPS.Methods;

/**
 * Test
 */
public class Test {

    static int x = 57;

    static void access(){
        System.out.println("X = "+x);
    }
    public static void main(String[] args) {
        // Test.access();

        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
        obj1.x++;
        System.out.println("Value of x in obj1 ");
        obj1.access();
        obj2.x++;
        System.out.println("Value of x in obj2 ");
        obj2.access();
        obj3.access();
    }
}