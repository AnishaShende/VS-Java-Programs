
class Even implements Runnable {
    public void run(){
        for(int i = 1; i <= 50; i ++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class Odd implements Runnable {
    public void run(){
        for(int i = 1; i <= 50; i ++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) throws Exception{
        Even obj1 = new Even();
        Thread t1 = new Thread(obj1);
        Odd obj2 = new Odd();
        Thread t2 = new Thread(obj2);
        t1.start();
        t1.join();
        t2.start();
    }
}
