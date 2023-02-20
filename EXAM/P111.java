// While inheriting class and implementing interface we must first extend a class and then implements the interface
// else we will get compile time error
// If we have created a parameterized constructor in super class (not default) then in sub class we have to first supply the required 
// parameters to the super class using super(param);
class P111 {
    public static void main(String[] args) {
        Result obj = new Result("as",57,100,99);
        obj.per_cal();
    }
}
interface Exam{
    void per_cal();
}
class Student {
    String name;
    int roll_no;
    double m1, m2;
    Student(){}
    Student(String name, int roll_no, double m1, double m2){
        this.name = name;
        this.roll_no = roll_no;
        this.m1 = m1;
        this.m2 = m2;
    }
}
class Result extends Student implements Exam {
    // @Override
    
    public void per_cal() {
        // TODO Auto-generated method stub
        double res = (m1+m2)/200*100;
        System.out.println("Result is "+res);
    }
    Result(String name, int roll_no, double m1, double m2){
        super(name,roll_no,m1,m2);
    }
}