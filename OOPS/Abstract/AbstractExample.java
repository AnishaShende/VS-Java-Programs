// package OOPS.Abstract;

abstract class Plan{
    double rate;
    abstract void getRate(double rate);
}
class CommercialPlan extends Plan{
    void getRate(double rate){
        // this.rate = rate*5.00;
        System.out.println(rate*5.00);
    }
}
class DomesticPlan extends Plan{
    void getRate(double rate){
        // this.rate = rate*2.60;
        System.out.println(rate*2.60);
    }
}
class Calculate{
    void calculateBill(){
        Plan ref;
        System.out.println("Commercial Plan");
        CommercialPlan c1 = new CommercialPlan();
        ref = c1;
        ref.getRate(100);
        System.out.println("Domestic Plan");
        DomesticPlan d1 = new DomesticPlan();
        ref = d1;
        ref.getRate(100);

    }

}
class AbstractExample {
    public static void main(String[] args) {
        Calculate obj  = new Calculate();
        obj.calculateBill();
    }
}
