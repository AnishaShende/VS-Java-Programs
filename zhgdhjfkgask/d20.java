import java.io.*;
class d21 implements Serializable{
    String name;
    int age;
    d21(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Name is "+name+" age is "+age;
    }
}
class d20{
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("Sample8");
        ObjectOutputStream os = new ObjectOutputStream(fout);
        d21 obj = new d21("Anisha", 18);
        // System.out.println(obj);
        os.writeObject(obj);
        FileInputStream fin = new FileInputStream("Sample8");
        ObjectInputStream is = new ObjectInputStream(fin);
        d21 obj1 = (d21) is.readObject();
        System.out.println(obj1);
    }
}