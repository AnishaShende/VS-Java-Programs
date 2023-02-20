import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserException extends Exception{
    UserException(String str){
        super(str);
    }
}
class d11 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String un, ps;
        System.out.println("Enter the username : ");
        un = br.readLine();
        System.out.println("Enter the password : ");
        ps = br.readLine();
        try{
            if((un.length() < 6) && !(ps.equals(un))){
                throw new UserException("UserName is less than 6 characters or password may not match username :(");
            }
        } catch(UserException ue){System.out.println(ue);}
    }
}
