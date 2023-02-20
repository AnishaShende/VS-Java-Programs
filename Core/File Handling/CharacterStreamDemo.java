import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("Sample5.txt");
        char c;
        int i = 0;
        i = fr.read();
        while(i != -1){
            c = (char) i;
            System.out.print(c);
            i = fr.read();
        }
    }
}
