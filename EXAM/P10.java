/*
 * If we try to print b in display2 method of class Two
P10.java:21: error: b has private access in One
        System.out.println("a = "+a+" b = "+b+" c = "+c+" d = "+d);
                                            ^
1 error
 */

class P10 {
    public static void main(String args[]){
        One o = new One();
        Two ob = new Two();
        o.display();
        ob.display2();
    }
}

class One {
    public int a;
    private int b;
    protected int c;
    int d;
    void display(){
        System.out.println("a, b, c, d = "+a+b+c+d);
    }
}
class Two extends One {
    void display2(){
        System.out.println("a = "+a+" c = "+c+" d = "+d);
    }
}