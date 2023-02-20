// package Core.Multithreading;

class myClass extends Thread{
    void task1(){
        System.out.println("Hello!");
    }
    void task2(){
        System.out.println("Hiiii!");
    }
    void task3(){
        System.out.println("Heyaa!");
    }
    public void run(){
        task1();
        task2();
        task3();
    }
}
public class SingleTasking {
    public static void main(String[] args) {
        myClass obj = new myClass();
        Thread t = new Thread(obj);
        t.start();
    }
}