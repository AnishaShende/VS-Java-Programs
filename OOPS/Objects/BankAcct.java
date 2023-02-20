import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAcct {
    
    private double balance;

    BankAcct(double bal){
        balance = bal;
    }

    //Inner class
    private class Interest{
        private double rate;

        Interest(double rate){
            this.rate = rate;
        }
        void calcInterest(){
            BankAcct.this.balance = 1000;
            double interest = balance*rate/100;
            balance += interest;
            System.out.println("Balance is Rs."+balance);
        }
    }

    //Contact method
    void contact(double r) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the password: ");
        String password = br.readLine();
        if (password.equals("Anisha")) {
            //Use only .equals method and not ==
            Interest obj = new Interest(r);
            obj.calcInterest();        
        }
        else{
            System.out.println("Wrong password!");
        }
    }
    public static void main(String[] args) throws IOException{
        BankAcct ba = new BankAcct(10000);
        ba.contact(10);
    }
}
