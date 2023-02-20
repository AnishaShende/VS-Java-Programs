class Threading1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Threading1.run()");;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
class Threading2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Threading2.run()");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
class ThreadDemo3 {
    public static void main(String[] args) throws Exception{
        Threading1 obj = new Threading1();
        Threading2 obj1 = new Threading2();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        // obj.start();
        // obj.join();
        // obj1.start();
        // System.out.println("Starting t1");
        t1.start();
        // // System.out.println("Started t1");
        // // System.out.println("aadada");
        // // System.out.println("hghjgjhgs");
        t1.join();
        // // System.out.println("Starting t2");
        t2.start();
        // System.out.println("Started t2");
    }
}