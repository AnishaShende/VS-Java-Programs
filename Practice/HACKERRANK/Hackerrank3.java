import java.util.Scanner;

class Hackerrank3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String[] arr = new String[10];
        
        // sc.nextLine();
        // int i = 0;
        // // System.out.println("Scnext = "+sc.next());
        int i = 1;
        while (sc.hasNext()) {
            System.out.println(i+" "+sc.nextLine());
            // System.out.println("Enter: ");
            // sc.next();
            // arr[i] = new String(sc.next());
            i++;
        }
        // for(String s: arr){
        //     System.out.println((s+1)+". "+arr);
        // }
        // for (int i = 1; sc.hasNext(); i++) {
            
        // }
        sc.close();
    }
}