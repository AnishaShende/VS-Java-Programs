// package EXAM;

class Account{
    int accno;
    String accname;
    double balance = 100;
    void deposite(int amt){
        balance += amt;
    }
    void withdraw(int amt){
        balance -= amt;
    }
}

class P6 {
    public static void main(String[] args) {
        Account ob = new Account();
        System.out.println("Balance is "+ob.balance);
        ob.deposite(1000);
        System.out.println("Balance is "+ob.balance);
        ob.withdraw(200);
        System.out.println("Balance is "+ob.balance);
    }
}