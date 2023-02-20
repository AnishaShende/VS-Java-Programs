import java.util.Scanner;

public class Hackerrank4 {
    static int B, H;
    static boolean flag;
    static{
        
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.err.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            flag = true;
        }
        sc.close();
    }
    public static void main(String[] args) {
        if(flag){
			int area=B*H;
			System.out.print(area);
		}
    }
}
