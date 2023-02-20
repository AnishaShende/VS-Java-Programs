public class Change {
    int a;
    int b;
    void swap(int a, int b){
        this.a = a;
        this.b = b;
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Change obj1 = new Change();
        int a = 10;
        int b = 20;
        System.out.println("Before");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        obj1.swap(a, b);
        System.out.println("After");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
