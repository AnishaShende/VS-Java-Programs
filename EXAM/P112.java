// When we implement the interface method we have to explicitly declare it public
// We can directly call a function within a same class no need to create an object

class P112 {
    public static void main(String[] args) {
        // Gross ref;
        // Salary obj = new Salary("as", 80000);
        // // obj.disp_sal();
        // // ref = new Salary("as", 80000);
        // ref = obj;
        // ref.disp_sal();
        Gross ref;
        ref = new Salary("as", 80000);
        ((Salary) ref).disp_sal();
    }
}
interface Gross {
    double ta = 100;
    double da = 100;
    void gross_sal();
}
class Employee {
    String name;
    double basic_sal;
    Employee(String name, double basic_sal){
        this.name = name;
        this.basic_sal = basic_sal;
    }
}
class Salary extends Employee implements Gross {
    double hra = 1000;
    Salary(String name, double basic_sal){
        super(name, basic_sal);
    }
    public void gross_sal(){
        Double gross = basic_sal+ta+da+hra;
        System.out.println("Gross salary is "+gross);
    }
    void disp_sal(){
        System.out.println(name);
        System.out.println(basic_sal);
        gross_sal();
    }
}