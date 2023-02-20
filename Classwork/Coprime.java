class Coprime{

    void CoprimeCheck(int a, int b){
        int count = 0;
        int lar = a > b ? a : b;
        for (int i = 1; i < lar/2; i++) {
            if(a % i == 0 && b % i == 0){
                count ++;
            }
        }
        if(count == 1){
            System.out.println(a+" and "+b+" are coprime numbers!");
        }
        else{
            System.out.println(a+" and "+b+" are not coprime numbers.");
        }
    }
    public static void main(String[] args) {
        Coprime obj = new Coprime();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        obj.CoprimeCheck(a, b);
    }
}
