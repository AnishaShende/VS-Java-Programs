import java.util.Vector;

class P5 {
    public static void main(String[] args) {
        Vector myVec = new Vector<>(5);
        myVec.add(10);
        myVec.addElement(30);
        myVec.add(50);
        myVec.add(20);
        myVec.add(40);
        myVec.add(10);
        myVec.add(20);
        myVec.remove(2);
        myVec.remove(3);
        myVec.insertElementAt(12, 2);
        System.out.println(myVec.size());
        System.out.println(myVec.capacity());
        System.out.println(myVec);
    }
}
