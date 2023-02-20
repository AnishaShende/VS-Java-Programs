import java.io.*;
public class d16 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str = br.readLine();
        int v = 0, d = 0, t = 0, bs = 0, count = 0;
        // String vowel[] = {"A", E,};
        char vowel[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i < str.length(); i ++){
            for (int j = 0; j < vowel.length; j++) {
                if(str.charAt(i) == vowel[j]){
                    v++;
                }
            }
            if(Character.isAlphabetic(str.charAt(i))){
                // System.out.print(str.charAt(i)+" ");
                count ++;
            }
            // for (int j = 0; j < vowel.length; j++) {
            //     if(Character.isAlphabetic(str.charAt(i)) && str.charAt(i) != vowel[j]) {
            //         System.out.print(str.charAt(i)+" ");
            //         c++;
            //     }
            // }
            if(Character.isDigit(str.charAt(i))){
                d ++;
            }
            if (str.charAt(i) == ' ') {
                bs ++;
            }
            if (str.charAt(i) == '\t') {
                t ++;
            }
        }
        count -= v;
        System.out.println("There are "+v+" vowels and "+count+" constants and "+d+" digits and "+t+" tabs "+bs+" blank spaces.");
    }
}
