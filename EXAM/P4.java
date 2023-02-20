import java.util.Scanner;
// package EXAM;
// Note we have to convert the stringbuffer string sb to string using toString() method
// String buffer class doesn't have equalIgnoreCase it only has equals()
class P4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String temp = str;
    StringBuffer sb = new StringBuffer(str);
    sb.reverse();
    str = sb.toString();
    if(temp.equalsIgnoreCase(str)){
        System.out.println("Palidrome");
    }
    else {
        System.out.println("Not palindrome");
    }
   } 
}
