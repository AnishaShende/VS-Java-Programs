import java.io.*;

public class File2 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("Sample7.txt");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String line = "";
        char c;
        int i = 0;
        int nw = 0, nl = 0;
        System.out.println("Enter the content of the file : ");
        s = br1.readLine();
        fw.write(s);
        fw.close();
        br1.close();
        BufferedReader br2 = new BufferedReader(new FileReader("Sample7.txt"));
        FileReader fr = new FileReader("Sample7.txt");
        while((line = br2.readLine()) != null){
            // while((i = fr.read()) != -1){
            nl++;
            String words[] = line.split(" ");
            nw += words.length;
        }
        System.out.println("Number of lines : "+nl);
        System.out.println("Number of words : "+nw);
    }    
}
