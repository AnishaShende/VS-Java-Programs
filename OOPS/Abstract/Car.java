// package OOPS.Abstract;

// Abstract class can contain non-abstract methods
public abstract class Car {
    int reg_no;
    Car(int reg_no){
        this.reg_no = reg_no;
    }
    void openTank(){
        System.out.println("Opening the tank ...");
    }
    abstract void steering(int direction, int angle);
    abstract void brakes(int force);
}