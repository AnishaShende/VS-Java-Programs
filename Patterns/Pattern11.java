public class Pattern11{
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row <= n; row++) {
            // int spaces = row*2;
            // int formula = 2*row-1;
            // for (int space = 1; space < spaces; space++) {
            //     System.out.print("* ");
            // }
            int spaces = row*2;
            int formula = 2*row-1;
            for (int space = 10; space > spaces; space--) {
                System.out.print(" ");
            }
            for (int col = 0; col < formula; col++) {
                // System.out.print(" *");
                System.out.print(" "+(row));
            }
            // for (int star = 0; star < spaces; star++) {
            //     System.out.print("* ");
            // }
            System.out.println();
        }
    }
}