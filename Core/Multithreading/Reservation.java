
class myClass implements Runnable{
    int available = 1;
    int wanted;
    String name;
    myClass(int num){
        wanted = num;
    }
    public void run(){
        synchronized(this){
            System.out.println("Available berths are : "+available);
            if(available >= wanted){
                name = Thread.currentThread().getName();
                System.out.println(wanted+" berth is reserved for "+name);
                available -= wanted;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("Sorry, no more berths are available!");
            }
        }
    }
}
public class Reservation {
    public static void main(String[] args) {
        myClass obj1 = new myClass(1);
        Thread t1 = new Thread(obj1, "Passenger1");
        Thread t2 = new Thread(obj1, "Passenger2");
        t1.start();
        t2.start();
    }
}
