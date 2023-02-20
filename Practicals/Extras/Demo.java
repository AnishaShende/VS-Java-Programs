// package Extras;

class ThreadDemo2 implements Runnable{
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
}

class Demo extends ThreadDemo2{
    public static void main(String[] args) {
        ThreadDemo2 obj = new ThreadDemo2();
        for (int i = 1; i <= 5; i++) {
            Thread t1 = new Thread(obj);
            t1.start();
        }
    }
}
