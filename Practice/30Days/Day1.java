import java.io.*; // for harassing Input/output 
import java.util.*; // contains Collections framework

// don't change the name of this class
class Day1 {
// you can add inner classes if needed class Main

 public static void main (String[] args) {

// Your code here 
int n, k, x, temp, l, sum = 0;

// int arr[k]; 
// int price[] = new int[n];

Scanner sc = new Scanner(System.in);

n = sc.nextInt();

int price[] = new int[n]; 
k= sc.nextInt();

x= sc.nextInt();

for(int i=0; i < n; i++){ 
    price[i]= sc.nextInt();
} 
for(int i=0; i < n; i++){
    for(int j=i+1; j < n; j++){
        if(price[i] < price[j]){ 
            temp = price[i];
            price[i] = price[j]; 
            price[j] = temp;
        }
    }
    // System.out.print(price[i] + " ");
}
// System.out.println();
// while(k != 0){
// for (int i=0; i < n; i++){ 
//     while(price[i] != 0){
//     price[i] -= x; 
//     k --;
//     }
//     if(price[i] < 0){ 
//         price[i] = 0;
//     }
//     }
// }
l = price[0] - x;
for(int i = 0; i < n; i ++){
    if(k == 0){
        break;
    }
    if(price[i] > 0){
        while(price[i] > 0){
            price[i] -= x;
            k --;
            if(price[i] < l){
                price[i] += x;
                k ++;
                // continue;
            }
        }
    }
    System.out.print(price[i] + " ");
    if(price[i] < 0){
        price[i] = 0;
    }
}
System.err.println();
for(int i = 0; i < n; i++){
    System.out.print(price[i] + " ");
    sum += price[i];
}
System.out.println(sum);
}
}