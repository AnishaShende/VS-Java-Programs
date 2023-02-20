package OOPS.Basics;
// package OOPS;

class Person {
    String name;
    int age;
    void talk(){
        System.out.println("Hello I am "+name);
        System.out.println("My age is "+age);
    }
}

class Demo {
    public static void main(String[] args) {
        Person Anisha = new Person();
        Anisha.name = "Anisha";
        Anisha.age = 17;
        Anisha.talk();
        System.out.println("Hash code = "+Anisha.hashCode());
    }
}
