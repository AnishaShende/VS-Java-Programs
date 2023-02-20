public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int temp = num;
        long fact = 1;
        while (temp > 0) {
            fact = fact * temp;
            temp--;
        }
        System.out.println("Fact of "+num+" is "+fact);
    }
}
