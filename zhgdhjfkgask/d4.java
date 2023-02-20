import java.io.*;
class d4 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("Sample.txt");        
        FileOutputStream fout = new FileOutputStream("Sample2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        PrintWriter pw = new PrintWriter(fout, true);
        String str;
        // char ch;
        // int count = 0;
        while((str = br.readLine()) != null){
                pw.println(str);
        }
        System.out.println("File Copied Successfully!");
    }
}
