// package OOPS.Abstract;

class Maruti extends Car{
    Maruti(int reg_no){
        super(reg_no);
    }
    void steering(int direction, int angle){
        System.out.println("Ordinary steering is moved in "+direction+" direction with "+angle+" angle.");
    }
    void brakes(int force){
        System.out.println("Hydrualic Brakes are applied! by force "+force);
    }
}