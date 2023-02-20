import java.io.BufferedReader;
import java.io.InputStreamReader;

class SalaryException extends Exception {
    // String str;
    SalaryException(String str){
        // this.str = str;
        super(str);
    }
    // public String toString(){
    //     return "Exception description : "+str;
    // }
}
class d7 {
    public static void main(String[] args) throws Exception{
        double sal;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the Salary : ");
            sal = Double.parseDouble(br.readLine());
            if(sal < 0){
                throw new SalaryException("Salary is negative");
            }
        } catch(SalaryException se){
            System.out.println(se);
            // printStackTrace(se);
        }
        // finally{}
    }
}
