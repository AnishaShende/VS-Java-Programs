class StudentDemo{
    String name;
    int id;
    int marks;
    String addr;
    // All the setter methods are mutator methods and all the getter methods are accessor
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
    void setMarks(int marks){
        this.marks = marks;
    }
    float getMarks(){
        return marks;
    }
    void setAddr(String addr){
        this.addr = addr;
    }
    String getAddr(){
        return addr;
    }
    public static void main(String[] args) {
        StudentDemo obj = new StudentDemo();
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