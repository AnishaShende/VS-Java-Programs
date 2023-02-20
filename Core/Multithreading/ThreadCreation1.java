// package Core.Multithreading;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Multithreadinggg . . .");
    }
}
public class ThreadCreation1 {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        // Thread t = new Thread(obj);
        obj.start();
        // Thread t1 = new Thread(obj, "Anisha");
    }
}