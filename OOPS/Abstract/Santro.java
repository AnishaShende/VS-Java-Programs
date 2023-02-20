// package OOPS.Abstract;

class Santro extends Car{
    Santro(int reg_no){
        super(reg_no);
    }
    void steering(int direction, int angle){
        System.out.println("Power steering is moved in "+direction+" direction with "+angle+" angle.");
    }
    void brakes(int force){
        System.out.println("Gas Brakes are applied! by force "+force);
    }
}
