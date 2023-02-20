import java.io.*;
import java.util.StringTokenizer;

public class Codechef5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        int res[] = new int[n];
        int temparr[] = new int[3];
        int ans;
        
        for (int i = 0; i < n; i++) {
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                String s3 = st.nextToken();
                s1 = s1.trim();
                s2 = s2.trim();
                s3 = s3.trim();
                temparr[0] = Integer.parseInt(s1);
                temparr[1] = Integer.parseInt(s2);
                temparr[2] = Integer.parseInt(s3);
                ans = (temparr[0]*2+temparr[1]*2)*temparr[2];
                res[i] = ans;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
