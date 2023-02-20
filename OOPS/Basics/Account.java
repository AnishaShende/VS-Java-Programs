package OOPS.Basics;

public class Account {
    double balance;
    public void initialize(){
        balance = 1000;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Account ac = new Account();
        ac.initialize();
        System.out.println("Deposit some amount");
        ac.deposit(100);
        System.out.println("Total balance is: "+ac.getBalance());
        System.out.println("Withdrawing some amount");
        ac.withdraw(200);
        System.out.println("Total balance is: "+ac.getBalance());
    }
}
