import java.io.*;

public class Copy {
    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("Sample.txt");
        FileOutputStream fout = new FileOutputStream("Sample1.txt");
        char c = 'a';
        int i = 0;
        try{while(i != -1){
            i = fin.read();
            fout.write(i);
        }} catch(IOException ioe){}
        System.out.println("File copied successfully !");
        // if(fin!=null)
        // fin.close();
        // if(fout!=null)
        // fout.close();
    }
}


// class Copy
// {
//  public static void main(String args[]) throws IOException
// {
// FileInputStream in= new FileInputStream("input.txt");
// FileOutputStream out= new FileOutputStream("output.txt");
// int c=0;
// try
// {
//  while(c!=-1)
//  {
//  c=in.read();
//  out.write(c);
//  }
//  System.out.println("File copied to output.txt....");
//  }
// finally
// {
//  

//  }
//  }
// }
