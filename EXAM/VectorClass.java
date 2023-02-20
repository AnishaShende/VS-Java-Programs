// package EXAM;
import java.util.Vector;
public class VectorClass {
    public static void main(String[] args) {
        Vector v1 = new Vector<>(5);
        v1.add(5);
        v1.add(15);
        v1.add(25);
        v1.add(35);
        v1.add(45);
        System.out.println(v1);
        v1.insertElementAt(0, 1);
        System.out.println(v1);
        v1.remove(0);
        v1.remove(3);
        System.out.println(v1);
    }
}
