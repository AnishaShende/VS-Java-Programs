import java.io.*;

public class File1 {
    public static void main(String[] args) throws IOException{
        // FileInputStream fin = new FileInputStream("Sample6.txt");
        FileOutputStream fout = new FileOutputStream("Sample6.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i = 0, j = 0, nc = 0, nw = 0;
        char c;
        System.out.println("Enter the content of file :");
        str = br.readLine();
        i = str.length()-1;
        while(i >= 0){
            c = str.charAt(j);
            fout.write(c);
            if(c == ' '){
                nw ++;
            }
            else{
                nc ++;
            }
            j++;
            i--;
        }
        // fout.flush();
        fout.write((int)nc);
        fout.write((int)nw);
        fout.close();
    }
}
