// import OOPS.Packages.pack1.A;

// package zhgdhjfkgask;

class d1 {
    int id;
    String name;
    void setData(int id, String name){
        this.id = id;
        this.name = name;
    }
    void getData(){
        System.out.println("id = "+id+" name = "+name);
    }
    public static void main(String[] args) {
        d1 D1 = new d1();
        d1 D2 = new d1();
        d1 D3 = new d1();
        d1 D4 = new d1();
        d1 D5 = new d1();
        D1.setData(1, "sdsd");
        D2.setData(2, "sdsd");
        D3.setData(31, "sdsd");
        D4.setData(51, "sdsd");
        D5.setData(61, "sdsd");
        D1.getData();
        D2.getData();
        D3.getData();
        D4.getData();
        D5.getData();
    }
}
