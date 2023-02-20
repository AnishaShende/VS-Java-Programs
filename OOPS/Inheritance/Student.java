class Teacher{
    String name;
    int id;
    float sal;
    String addr;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setId(int id){
        this.id = id;
    }
    int getId(){
        return id;
    }
    void setSal(float sal){
        this.sal = sal;
    }
    float getSal(){
        return sal;
    }
    void setAddr(String addr){
        this.addr = addr;
    }
    String getAddr(){
        return addr;
    }
}

class Student extends Teacher{
    int marks;
    void setMarks(int marks){
        this.marks = marks;
    }
    int getMarks(){
        return marks;
    }
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setId(57);
        obj.setName("Anisha");
        obj.setMarks(98);
        obj.setAddr("India");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getMarks());
        System.out.println(obj.getAddr());
    }
}