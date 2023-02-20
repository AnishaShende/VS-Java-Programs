package OOPS.Basics;
// package OOPS;

class OriginalHuman{
    String name;
    int age;
    OriginalHuman(String n, int a){
        name = n;
        age = a;
    }
    void speak(){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
}

public class Human {
    public static void main(String[] args) {
        OriginalHuman Anisha = new OriginalHuman("Anisha", 17);
        OriginalHuman Taehyung = new OriginalHuman("Taehyung", 17);
        Anisha.speak();
    }
}
