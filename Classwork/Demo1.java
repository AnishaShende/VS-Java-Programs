// package Classwork;
// Program to print prime numbers upto given number
// 10 - 2 3 5 7
class Demo1 {
    public static void main(String[] args) {
        int num = 10;
        int flag = 0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag ++;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
            flag = 0;
        }
    }
}
