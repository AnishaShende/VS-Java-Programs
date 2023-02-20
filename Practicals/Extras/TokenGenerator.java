// package Extras;

class TokenGenerator extends Thread {
    int token1 = 1;
    int token2 = 11;
    int token = 0;
    int id;
    String food;
    void northIndian(){
        id = (int)Thread.currentThread().getId();
        food = "North Indian";
        token = token1;
        token1 ++;
    }
    void southIndian(){
        id = (int)Thread.currentThread().getId();
        food = "South Indian";
        token = token2;
        token2 ++;
    }
    public void run(){
        synchronized(this){
            id = (int)Thread.currentThread().getId();
            if (id%2==0) {
                northIndian();
            } else {
                southIndian();
            }
            System.out.println("Thread no "+id+" will go for "+food+" food."+" Token number "+token+" is assigned to it.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        TokenGenerator tg = new TokenGenerator();
        for (int i = 1; i <= 10; i++) {
            Thread t1 = new Thread(tg);
            t1.start();
        }
        for (int j = 11; j <= 20; j++) {
            Thread t2 = new Thread(tg);
            t2.start();
        }
    }
}
