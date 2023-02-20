// package zhgdhjfkgask;

class One{
    void display(){
        System.out.println("One");
    }
}
class Two extends One{
    void display(){
        System.out.println("Two");
    }
}
class Three extends One {
    void display(){
        System.out.println("Three");
    }
}
class d2 {
    public static void main(String[] args) {
        One o;
        Two t = new Two();
        Three t1 = new Three();
        boolean b = t instanceof Two;
        boolean b1 = t1 instanceof One;
        System.out.println(b+" "+b1);
        o = new Two();
        o.display();
        o = t1;
        o.display();
    }
}
