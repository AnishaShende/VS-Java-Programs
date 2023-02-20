import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter ["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose is: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                // System.out.println("Array["+i+"]["+j+"]: "+arr[i][j]);
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
