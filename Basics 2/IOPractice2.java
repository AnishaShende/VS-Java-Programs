import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IOPractice2 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter id, salary, name (comma separated): ");
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, ",");
        
        String name1 = st.nextToken();
        String name2 = st.nextToken();
        String name3 = st.nextToken();

        name1 = name1.trim();
        name2 = name2.trim();
        name3 = name3.trim();

        int id = Integer.parseInt(name1);
        long salary = Long.parseLong(name2);
        String name = name3;
        
        System.out.println("Id is: "+id);
        System.out.println("Gender is: "+salary);
        System.out.println("Name is: "+name);
    }
}
