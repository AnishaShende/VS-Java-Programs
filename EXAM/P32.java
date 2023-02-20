import java.util.Scanner;

// package EXAM;

class P32 {
   public static void main(String[] args) {
    int flag = 0, num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    for(int i = 2; i <= num; i ++){
        flag = 0;
        for(int j = 2; j < i/2; j++){
            if(i%j==0){
                flag++;
            }
        }
        if(flag == 0){
            System.out.print(i+" ");
        }
    }
    System.out.println();
   } 
}
