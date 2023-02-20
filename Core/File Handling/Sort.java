// Incorrect

import java.io.*;

public class Sort {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = new FileInputStream("Sample3.txt");
        FileOutputStream fout = new FileOutputStream("Sample4.txt");
        int i = 0, j = 0;
        char temp;
        char arr[] = new char[5];
        // while(i != 5){
        //     arr[i] = fin.read();
        //     // System.out.println(arr[i]);
        //     // fout.write(arr[i]);
        //     // // fout.write(' ');
        //     i++;
        // }
        while (j != -1 && i < 5) {
            j = fin.read();
            // arr[i] = (char)j;
            fout.write(arr[i]);
            i++;
            // System.out.println(j);
        }
        for(i = 0; i < 5; i ++){
            for(j = i+1; j < 5; j ++){
                if(Integer.parseInt(arr[i]) > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        i = 0;
        while(j != -1 && i < 5){
            fout.write(arr[i]);
        }
        // for (char k : arr) {
        //     System.out.println(k);
        // }
        System.out.println("Numbers copied successfully !");
    }
}
