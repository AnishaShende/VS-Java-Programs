class P9{
    public static void main(String[] args) {
        Two ob = new Two();
        One obj = new One(ob);
        obj.display();
    }
}

class One{
    int num = 5;
    Two ref;
    One(Two ref){
        this.ref = ref;
    }
    void display(){
        ref.display();
        System.out.println(num);
    }
}

class Two{
    int a = 7;
    void display(){
        System.out.println(a);
    }
}