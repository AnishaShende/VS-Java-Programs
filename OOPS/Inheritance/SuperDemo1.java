class SuperClass{
    int i;
    SuperClass(int i){
        this.i = i;
    }
}
class SubClass extends SuperClass{
    int i;
    SubClass(int a, int b){
        super(a);
        i = b;
    }
    void show(){
        System.out.println("Super i = "+super.i);
        System.out.println("Sub i = "+i);
    }
}

public class SuperDemo1 {
    public static void main(String[] args) {
        SubClass s = new SubClass(10, 20);
        s.show();
    }
}
