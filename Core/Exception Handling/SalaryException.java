import java.io.*;
public class SalaryException extends Exception{
    String msg;
    SalaryException(String msg){
        super(msg);
        this.msg = msg;
    }
    public String toString(){
        return "Message : "+msg;
    }
    public static void main(String[] args) throws IOException{
        String name;
        double salary;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the employee :");
        name = br.readLine();
        System.out.println("Enter the salary of the employee :");
        try{
            salary = Double.parseDouble(br.readLine());
            if(salary <= 0){
                throw new SalaryException("Salary is negative :(");
            }
        }
        catch(SalaryException se){
            System.out.println(se);
        }
        finally{
            System.out.println("Successfully executed!");
        }
    }
}
