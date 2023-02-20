//  Incomplete program

class Deadlock1 extends Thread{
    public static void main(String[] args) {
        BookTicket b1 = new BookTicket();
        CancelTicket c1 = new CancelTicket();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(c1);
    }
}
class BookTicket extends Thread{

    public void run(){
        synchronized(this){
            System.out.println("Booking the train tickets");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("Bookticket now waiting to lock compartment");
        }
        
    }
}
class CancelTicket extends Thread{
    public void run(){}
}