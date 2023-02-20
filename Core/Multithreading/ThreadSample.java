// package Core.Multithreading;


class ThreadSample {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread is "+t);
        System.out.println("Thread name is "+t.getName());
    }
}