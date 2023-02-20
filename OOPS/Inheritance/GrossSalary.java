// package OOPS.Inheritance;

interface Salary{
    void Basic_Sal(double Basic_salary);
}
class Employee{
    String name;
    int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class GrossSalary extends Employee implements Salary{
    double ta, da, hra, sal;
    GrossSalary(String name, int age, double ta, double da, double hra){
        super(name, age);
        this.ta = ta;
        this.da = da;
        this.hra = hra;
    }
    public void Basic_Sal(double sal){
        this.sal = sal;
        display();
        System.out.println("Basic salary = "+sal);
    }
    void Total_Sal(){
        System.out.println("Total salary = "+(sal+ta+da+hra));
    }
    public static void main(String[] args) {
        GrossSalary gs = new GrossSalary("Sam", 18, 1000, 2000, 5000);
        gs.Basic_Sal(500000);
        gs.Total_Sal();
    }
}
