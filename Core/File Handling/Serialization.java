import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
class A implements Serializable {
    int a;
    String name;
    A(int x, String y){
        a = x;
        name = y;
    }
    public String toString(){
        return "a : "+a+" name : "+name;
    }
}
class Serialization {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("Sample");
        ObjectOutputStream os = new ObjectOutputStream(fout);
        A obj = new A(31, "xyz");
        System.out.println(obj);
        os.writeObject(obj);
        FileInputStream fin = new FileInputStream("Sample");
        ObjectInputStream is = new ObjectInputStream(fin);
        A obj1 = (A)is.readObject();
        System.out.println(obj1);
        os.close();
        is.close();
    }
}