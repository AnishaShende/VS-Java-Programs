class P101 {
    public static void main(String[] args) {
        Rectangle o = new Rectangle(10, 20);
        Box ob = new Box(10, 20, 30);
        System.out.println("Area of rectangle is : "+o.area());
        System.out.println("Area of box is : "+ob.area());
        System.out.println("Volume of box is : "+ob.volume());
    }
}

class Rectangle{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }
}

class Box extends Rectangle {
    double depth;
    Box(double length, double width, double depth){
        super(length, width);
        this.depth = depth;
    }
    double volume(){
        return (length*width*depth)/2;
    }
    double area(){
        return length*width*depth;
    }
}