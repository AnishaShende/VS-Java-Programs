import java.io.*;
class d19 {
    public static void main(String[] args) throws Exception{
        File file = new File("Sample3.txt");
        FileReader fr = new FileReader(file);
        char ch[] = new char[(int) file.length()];
        File file1 = new File("Sample4.txt");
        FileWriter fw = new FileWriter(file1);
        fr.read(ch);
        fw.write(ch);
        fw.flush();
        fw.close();
        System.out.println("Data copied successfully!");
    }

}
