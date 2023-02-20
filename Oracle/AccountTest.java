import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        double amount = sc.nextDouble();
        SavingBond obj = new SavingBond();
        obj.InterestCalc(amount);
        sc.close();
    }
}

class SavingBond{
    int term;
    double interest;
     void InterestCalc(double amt){
        Scanner sc = new Scanner(System.in);
        int nMonth, i = 0;
        double rate = 0, temp = amt;
        System.out.println("Enter the number of months : ");
        nMonth = sc.nextInt();
        if (nMonth >= 0 && nMonth <= 11) {
            rate = 0.005/12;
        }
        else if (nMonth >= 12 && nMonth <= 23) {
            rate = 0.01/12;
        }
        else if (nMonth >= 24 && nMonth <= 35) {
            rate = 0.015/12;
        }
        else if (nMonth >= 36 && nMonth <= 47) {
            rate = 0.02/12;
        }
        else if (nMonth >= 48 && nMonth <= 60) {
            rate = 0.025/12;
        }
        else {
            System.out.println("Invalid value!.");
        }
        while (i < nMonth) {
            interest = temp * rate;
            temp += interest;
            i++;
        }
        System.out.println("Rate is: "+rate);
        System.out.println("Total Savings are: "+temp);
        System.out.println("Total interest earned: "+(temp-amt));
        sc.close();
     }
}
