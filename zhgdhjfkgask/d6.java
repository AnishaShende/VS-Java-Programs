
class As extends Thread{
    // @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }
}
class Dec extends Thread{
    // @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 50; i > 0; i--) {
            System.out.println(i);
        }
    }
}
class d6 {
    public static void main(String[] args) throws Exception{
        As obj = new As();
        Thread t1 = new Thread(obj, "Ascending");
        Dec obj1 = new Dec();
        Thread t2 = new Thread(obj1, "Decending");
        t1.start();
        t1.join();
        t2.start();
    }    
}
