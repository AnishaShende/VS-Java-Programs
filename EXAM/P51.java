import java.io.IOException;
import java.util.Vector;
import java.util.*;
import java.io.*;
// package EXAM;
class P51 {
    public static void main(String[] args) throws IOException{
        Vector myVec = new Vector<>(6);
        myVec.add(5);
        myVec.add(7);
        myVec.add("Nikola");
        myVec.add("Tesla");
        myVec.add(99.9);
        myVec.add(95.9);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(myVec);
        while(true){
            System.out.println("Enter the index of element you want to remove: ");
            int i = Integer.parseInt(br.readLine());
            myVec.remove(i);
            System.out.println(myVec);
            if(myVec.isEmpty())
                break;
        }
    }
}
