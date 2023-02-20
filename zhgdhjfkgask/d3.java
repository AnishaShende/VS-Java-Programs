// import java.io.BufferedReader;
// import java.io.InputStream;
// import java.io.InputStreamReader;

// package zhgdhjfkgask;
import java.io.*;
class d3 {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = new FileInputStream("Sample.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        String str;
        int count = 1;
        while((str = br.readLine()) != null){
            System.out.println(str);
            for(int i = 0; i < str.length(); i ++){
                if (str.charAt(i) == ' ') {
                    count ++;
                }
            }
        }
        System.out.println("Number of words in the file are : "+count);
    }    
}
