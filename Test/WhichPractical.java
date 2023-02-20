class WhichPractical {
    public static void main(String[] args) {
        int pr = 1;
        for (int i = 1; i <= 60; i++) {
            if(i == 34 || i == 46 || i == 56){
                continue;
            }
            else{
                System.out.println("Enrollment no "+i+" will perform " +pr+ " practical.");
                pr ++;
                if(pr == 18){
                    pr = 1;
                }
            }
        }
    }
}
