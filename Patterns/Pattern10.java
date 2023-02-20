public class Pattern10{
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < 2*n; row++) {
            int spaces = row>n?2*n-row:row;
            int formula = row>n?row:2*n-row;
            for (int col = 0; col < formula; col++) {
                System.out.print(" ");
            }
            for (int star = 0; star < spaces; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}