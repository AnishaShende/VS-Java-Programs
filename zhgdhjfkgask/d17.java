class d17 {
    public static void main(String[] args) {
        int fact = Integer.parseInt(args[0]);
        int temp = 1;
        for(int i = fact; i > 0; i --){
            temp *= i;
        }
        System.out.println("Fact = "+temp);
    }    
}
