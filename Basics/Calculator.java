package Basics;
class Calculator {

    double num1;
    double num2;

    public void Addition(double a, double b){
        double result;
        num1 = a;
        num2 = b;
        result = a + b;
        System.out.println("Addition is: "+result);
    }

    public void Substraction(double a, double b){
        double result;
        num1 = a;
        num2 = b;
        result = a - b;
        System.out.println("Substraction is: "+result);
    }

    public void Multiplication(double a, double b){
        double result;
        num1 = a;
        num2 = b;
        result = a * b;
        System.out.println("Multiplication is: "+result);
    }

    public void Division(double a, double b){
        double result;
        num1 = a;
        num2 = b;
        result = a / b;
        System.out.println("Division is: "+result);
    }

    public static void main(String[] args) {

            Calculator add = new Calculator();
            Calculator minus = new Calculator();
            Calculator multiply = new Calculator();
            Calculator divide = new Calculator();
        
            add.Addition(10, 10);
            minus.Substraction(10, 10);
            multiply.Multiplication(10, 10);
            divide.Division(10, 10);
            }

}

// class Main {
// public static void main(String[] args) {

//     Calculator add = new Calculator();
//     Calculator minus = new Calculator();
//     Calculator multiply = new Calculator();
//     Calculator divide = new Calculator();

//     add.Addition(10, 10);
//     minus.Substraction(10, 10);
//     multiply.Multiplication(10, 10);
//     divide.Division(10, 10);
//     }
// }
