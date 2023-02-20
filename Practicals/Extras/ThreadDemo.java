// package Extras;

class ThreadDemo extends Thread{
    int token = 0;
    String str;
    void tokenCount(){
        token ++;
    }
    public void run(){
        synchronized(this){
            str = Thread.currentThread().getName();
            System.out.println(str+" thread is assigned the token: "+token);
            tokenCount();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        ThreadDemo obj = new ThreadDemo();
        for (int i = 1; i <= 5; i++) {
            Thread t1 = new Thread(obj);
            t1.start();
        }    
    }
}
