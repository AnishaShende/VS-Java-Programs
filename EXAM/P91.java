class P91 {
    public static void main(String[] args) {
        Three o = new Three();
        Two ob = new Two(o);
        One obj = new One(ob);
        // One obj1 = new One(new Two(new Three()));
        System.out.println(obj.cube(5));
    }
}

class One{
    Two ref2;
    One(Two ref2){
        this.ref2 = ref2;
    }
    int cube(int num){
        int a = num*ref2.square(num);
        return a;
    }
}
class Two{
    Three ref3;
    Two(Three ref3){
        this.ref3 = ref3;
    }
    int square(int num){
        int a = ref3.display(num);
        return a*a;
    }
}
class Three{
    // int a;
    // Three(int a){
    //     this.a = a;
    // }
    int display(int a){
        return a;
    }
}