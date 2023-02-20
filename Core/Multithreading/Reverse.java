
class Reverse1 implements Runnable {
    public void run(){
        for(int i = 1; i <= 50; i ++){
            System.out.println(i);
        }
    }
}
class Reverse2 implements Runnable {
    public void run(){
        for(int i = 50; i > 0; i --){
            System.out.println(i);
        }
    }
}
public class Reverse {
    public static void main(String[] args) throws Exception{
        Reverse1 obj1 = new Reverse1();
        Thread t1 = new Thread(obj1);
        t1.start();
            t1.join();
        Reverse2 obj2 = new Reverse2();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
