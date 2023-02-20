import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion {
    static int fact(int num){
        if (num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num, res;
        System.out.println("Enter a number :");
        num = Integer.parseInt(br.readLine());
        res = fact(num);
        System.out.println("Fact of "+num+" is "+res);
    }
}
