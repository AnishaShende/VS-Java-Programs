class d10 {
    int n1, n2;
    d10(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    void showresult(){
        int s;
        int flag = 1;
        if(n1 < n2){
            s = n1;
        }
        else {
            s = n2;
        }
        for (int i = 2; i <= s/2; i++) {
            if(n1%i==0 && n2%i==0){
                flag ++;
            }
        }
        if(flag == 1){
            System.out.println("Numbers "+n1+" "+n2+" are coprime numbers.");
        }
        else {
            System.out.println("Numbers "+n1+" "+n2+" are not coprime numbers.");
        }
    }
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        d10 obj = new d10(a, b);
        obj.showresult();
    }
}
