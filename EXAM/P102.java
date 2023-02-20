class P102 {
    public static void main(String[] args) {
        Plan ref;
        CommercialPlan ob1 = new CommercialPlan(1000);
        DomesticPlan ob2 = new DomesticPlan(1000);
        ref = ob1;
        ref.getRate();
        ref = ob2;
        ref.getRate();
    }
}
abstract class Plan{
    double rate;
    abstract void getRate();
}
class CommercialPlan extends Plan{
    double amt;
    double rate = 5.00;
    CommercialPlan(double amt){
        this.amt = amt;
    }
    void getRate(){
        System.out.println("Commercial amt is "+amt*rate);
    }

}
class DomesticPlan extends Plan{
    double amt;
    double rate = 2.60;
    DomesticPlan(double amt){
        this.amt = amt;
    }
    void getRate(){
        System.out.println("Domestic amt is "+amt*rate);
    }
}