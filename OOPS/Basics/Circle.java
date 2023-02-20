public class Circle {
    final double PI = 3.14;
    double radius;
    Circle(double r){
        radius = r;
    }
    void display(){
        System.out.println("Area = "+(PI*radius*radius));
    }
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.display();
    }
}
