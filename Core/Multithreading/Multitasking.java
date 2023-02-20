// package Core.Multithreading;

class myClass implements Runnable{
    String str;
    myClass(String str){
        this.str = str;
    }
    // void task1(){
    //     System.out.println("Task 1");
    //     for (int i = 1; i <= 5; i++) {
    //         System.out.print(i+" ");
    //     }
    // }
    // void task2(){
    //     System.out.println("Task 2");
    //     for (int i = 1; i <= 5; i++) {
    //         System.out.println(i+" ");
    //     }
    // }
    public void run(){
        // for(int i = 1; i <= 20; i++){
        //     System.out.print(i+" ");
        // }
        // task1();
        // task2();
        for (int i = 1; i <= 5; i++) {
            System.out.println(str+" : "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

public class Multitasking {
    public static void main(String[] args){
        myClass obj1 = new myClass("Cut the ticket");
        myClass obj2 = new myClass("Show the seat");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    //     myClass obj = new myClass();
    //     Thread t1 = new Thread(obj);
    //     Thread t2 = new Thread(obj);
    //     t1.start();
    //     t2.start();
    }
}
