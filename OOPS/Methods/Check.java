class Employee {
    int id1;
    int id2;
    Employee(int id1, int id2){
        this.id1 = id1;
        this.id2 = id2;
    }
}
class Check{
    void swap(Employee obj1){
        int temp;
        temp = obj1.id1;
        obj1.id1 = obj1.id2;
        obj1.id2 = temp;
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee(10, 20);
        Check obj = new Check();
        System.out.println("Before");
        System.out.println("ID1 = "+obj1.id1+"  ID2 = "+obj1.id2);
        obj.swap(obj1);
        System.out.println("After");
        System.out.println("ID1 = "+obj1.id1+"  ID2 = "+obj1.id2);
    }
}
