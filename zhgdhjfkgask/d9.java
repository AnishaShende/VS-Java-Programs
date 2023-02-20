public class d9{
    public static void main(String args[]){
    //Converting int into Integer
    int a=20;
    Integer i=Integer.valueOf(a);//converting int into Integer
    Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
    int g = 70;
    char ch1 = 'A';
    char ch = (char)g;
    int f = ch1;
    System.out.println("g = "+g+" ch1 = "+ch1+" ch = "+ch+" f = "+f);
    // System.out.println(a+" "+i+" "+j);
    }} 