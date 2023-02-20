import java.io.*;
class P92 {
    public static void main(String[] args) throws IOException{
        BankAcct ba = new BankAcct();
        System.out.println("Enter the balance : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double balance = Double.parseDouble(br.readLine());
        ba.balance = balance;
        System.out.println("Enter rate of interest : ");
        ba.rate = Double.parseDouble(br.readLine());
        ba.contact();
    }
}
class BankAcct{
    double rate, balance = 100;
    private class Interest{
        double calculateInterest(double balance){
            double interest = balance*rate/100;
            balance += interest;
            return balance;
        }
    }
    void contact() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the password : ");
        String pwd = br.readLine();
        if(pwd.equals("Elon")){
            Interest i = new Interest();
            System.out.println("Balance is : "+i.calculateInterest(balance));
        }
        else{
            System.out.println("Wrong password!");
            return;
        }
    }
}