import java.io.BufferedReader;
import java.io.IOError;
import java.io.InputStreamReader;
import java.io.*;
class d13 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int[][] d = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter element for a["+i+"]["+j+"] : ");
                    a[i][j] = Integer.parseInt(br.readLine());
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter element for b["+i+"]["+j+"] : ");
                    b[i][j] = Integer.parseInt(br.readLine());
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter element for c["+i+"]["+j+"] : ");
                    c[i][j] = Integer.parseInt(br.readLine());
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    d[i][j] = a[i][j]*b[i][j]*c[i][j];
                    System.out.print(d[i][j]+" ");
                }
                System.out.println();
            }
    }
}
