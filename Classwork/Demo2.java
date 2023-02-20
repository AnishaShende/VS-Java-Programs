// package Classwork;
//Program to print given number of prime numbers
// 5 - 2 3 5 7 11
class Demo2 {
    public static void main(String[] args) {
        int num = 5;
        int flag = 0;
        int count = 0;
        while (count != num) {
            for (int i = 2; i < 1000; i++) {
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        flag ++;
                    }
                }
                if (flag == 0) {
                    System.out.print(i+" ");
                    count ++;
                }
            else if(count == num){
                break;
            }
                flag = 0;
            }
        }
    }
}
