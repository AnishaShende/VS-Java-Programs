class One {
    int a;
    int b;
    Two obj;

    One(Two obj){
        // obj.a = 10;
        // obj.b = 20;
        this.obj = obj;
        a = 55;
        b = 99;
    }
    void displayOne(){
        // obj.displayTwo();
        System.out.println("In one a = "+a);
        System.out.println("In one b = "+b);
    }
    // void cube(){
    //     double c = obj.a*obj.a*obj.a;
    //     System.out.println("Cube is "+c);
    // }
}
class Two{
    
    int a, b;
    Two(){
        a = 0;
        b = 0;
    }
    Two(int a, int b){
        this.a = a;
        this.b = b;
    }
    void displayTwo(){
        System.out.println("In two a = "+a);
        System.out.println("In two b = "+b);
    }
}

class Relate{
    public static void main(String[] args) {
        Two obj2 = new Two(22, 44);
        obj2.displayTwo();
        // One obj1 = new One(obj2);
        One obj1 = new One(new Two(22, 44));
        obj1.displayOne();
        // obj1.cube();
    }
}
