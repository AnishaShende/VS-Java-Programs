class A{
    synchronized void callInA(B obj){
        String str = Thread.currentThread().getName();
        System.out.println(str+" entered the callInA");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println(str+" waiting for last method");
        obj.last();
    }
    synchronized void last(){
        System.out.println("Inside the last method of A");
    }
}
class B{
    synchronized void callInB(A obj){
        String str = Thread.currentThread().getName();
        System.out.println(str+" entered the callInB");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println(str+" waiting for last method");
        obj.last();
    }
    synchronized void last(){
        System.out.println("Inside the last method of B");
    }
}
class Deadlock2 implements Runnable{
    A a = new A();
    B b = new B();
    Deadlock2(){
        Thread.currentThread().setName("MainThread");
        Thread t1 = new Thread(this, "RacingThread");
        t1.start();
        a.callInA(b);
        System.out.println("Back in main thread");
    }
    public void run(){
        b.callInB(a);
        System.out.println("Back in racing thread");
    }
    public static void main(String[] args) {
        new Deadlock2();
    }
}
