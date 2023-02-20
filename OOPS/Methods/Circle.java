import java.text.NumberFormat;

class Circle{
    public static void main(String args[]){
        final double PI = (double) 22/7;
        double radius = 15.5;
        double area;
        area = PI*radius*radius;
        System.err.println("Area is "+area);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(7);
        nf.setMaximumFractionDigits(2);
        String str = nf.format(area);
        System.out.println("Area after formatting is "+str);
    }
}