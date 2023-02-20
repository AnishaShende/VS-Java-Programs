class Commercial {
    String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void calculateBill(double amt){
        System.out.println("Charge is "+amt*5);
    }
}
class Domestic extends Commercial{
    void calculateBill(double amt){
        System.out.println("Charge is "+amt*2.50);
    }
}
class OverridingProgram{
    public static void main(String[] args) {
        Commercial ob = new Commercial();
        ob.setName("Anisha");
        System.out.println("Name is : "+ob.getName());
        ob.calculateBill(100);
        Domestic ob1 = new Domestic();
        ob1.setName("Piyush");
        System.out.println("Name is : "+ob1.getName());
        ob1.calculateBill(100);
    }
}