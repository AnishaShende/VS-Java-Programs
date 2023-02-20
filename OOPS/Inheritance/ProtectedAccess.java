
class SuperClass{
    private int a;
    protected int b;
}
class SubClass extends SuperClass{
    void show(){
        // ProtectedAccess.java:8: error: a has private access in SuperClass
        // super.a = 10; //Give errorsssssssssssssss
        super.b = 20;
    }
}
public class ProtectedAccess {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.show();
    }
}
