import java.io.IOException;
// package Core.Multithreading;

class myClass extends Thread{
    boolean stop = false;
    public void run(){
        System.out.println("Hiiiii");
        if(stop) return;
    }
}
public class Thread2 {
    public static void main(String[] args) throws IOException{
        myClass obj = new myClass();
        Thread t = new Thread(obj);
        t.start();
        System.in.read();
        obj.stop = true;
    }
}