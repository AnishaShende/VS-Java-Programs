// package EXAM;
// It will execute even if we don't provide command line arguments foreach loop will skip then
class P3 {
   public static void main(String[] args) {
    int a;
    for(int i = 0; i < 5; i ++){
        System.out.println(i);
    }
    for(String s: args){
        System.out.println(s);
    }
    a = 5;
    while(a!=0){
        System.out.println(a);
        a--;
    }
    a = 5;
    do{
        System.out.println(a);
        a--;
    }while(a != 0);
   }
}
