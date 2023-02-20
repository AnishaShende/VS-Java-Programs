import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.CountDownLatch;

class Matrix{
    
    int[][] getMatrix(int rows, int columns) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value for ["+i+"]["+j+"]: ");
                temp[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
        return temp;
    }
    static void findSum(int arr1[][], int arr2[][], int rows, int columns){
        int sum[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows;
        int columns;
        System.out.println("Enter the number of rows: ");
        rows = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns: ");
        columns = Integer.parseInt(br.readLine());
        int arr1[][] = new int[rows][columns];
        int arr2[][] = new int[rows][columns];
        Matrix obj1 = new Matrix();
        Matrix obj2 = new Matrix();
        System.out.println("Enter the elements of array 1");
        arr1 = obj1.getMatrix(rows, columns);
        System.out.println("Enter the elements of array 2");
        arr2 = obj2.getMatrix(rows, columns);
        System.out.println("Sum of two matrix is");
        Matrix.findSum(arr1, arr2, rows, columns);
    }
}