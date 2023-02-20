// package OOPS.Abstract;

public class UseCar {
    public static void main(String[] args) {
        Maruti o1 = new Maruti(100);
        Santro o2 = new Santro(200);
        Car ref;
        ref = o1;
        ref.brakes(10);
        ref.openTank();
        ref.steering(10, 30);
        ref = o2;
        ref.brakes(20);
        ref.openTank();
        ref.steering(20, 60);
    }
}
