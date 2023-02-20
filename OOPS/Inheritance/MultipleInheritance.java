class Shape{
    protected int l;
    Shape(int l){
        this.l = l;
    }
}
class Square extends Shape{
    Square(int l){
        super(l);
    }
    void Area(){
        // int area = super.l*super.l;
        int area = l*l;
        System.out.println("Area of square is "+area);
    }
}
class Rectangle extends Square{
    int b;
    Rectangle(int l, int b){
        super(l);
        this.b = b;
    }
    void Area(){
        int area = l*b;
        System.out.println("Area of rectangle is "+area);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Square s = new Square(10);
        s.Area();
        Rectangle r = new Rectangle(10, 20);
        r.Area();
    }
}
