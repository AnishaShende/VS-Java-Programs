public class Sample {
    private int x;
    Sample(){
        this(57);
        this.access();
    }
    Sample(int x){
        x++;
        this.x = x;
    }
    void access(){
        System.out.println("X = "+x);
    }
    public static void main(String[] args) {
        Sample obj1 = new Sample();
    }
}
