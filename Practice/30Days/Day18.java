// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//         // Your code here
//         Scanner sc = new Scanner(System.in);
//         StringBuffer sb = new StringBuffer();
//         int a, b;
//         int i = 0;
//         String ans = new String();
//         a = sc.nextInt();
//         b = sc.nextInt();
//         String str = sc.next();
//         sb.append(str.substring(a-1, b));
//         sb.reverse();
//     while(i != str.length()){
//         if(i == a-1){
//             ans += sb.toString();
//             i += (b-a+1);
//         }
//         else {
//             ans += str.charAt(i);
//             i++;
//         }
//     }
//         System.out.println(ans);
//     }
// }
// // public class Day18 {
    
// // }

int aLength = (int)(Math.log10(a)+1);
int bLength = (int)(Math.log10(b)+1);

boolean isHard = false;

if (aLength == bLength) {
  for (int i = 0; i < aLength; i++) {
    int aDigit = a % 10;
    int bDigit = b % 10;
    if (aDigit + bDigit >= 10) {
      isHard = true;
      break;
    }
    a /= 10;
    b /= 10;
  }
} else {
  isHard = true;
}

if (isHard) {
  System.out.println("Hard");
} else {
  System.out.println("Easy");
}