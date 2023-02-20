import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter: ");
        int n = Integer.parseInt(br.readLine());
        // int count = 0;
        // int limit = 1000;
        int flag = 0;
            // int i = 2;
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j < i/2; j++) {
                    if (i % j == 0) {
                        flag++;
                    }
                }
                if (flag == 0) {
                    System.out.print(i+" ");
                }
                flag = 0;
        }
    }
}
