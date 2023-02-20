class Sample{
    void show(int a){
        System.out.println(a);
    }
    void show(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        s.show(10);
        s.show(10, 20);
    }
}