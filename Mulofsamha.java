public class Mulofsamha {
    public static void main(String[] args) {
        int three = 3;
        int five = 5;
        int plus = 0;
        while(three < 1000){
            if(three < five){
                //multi.add(three);
                plus += three;
                three += 3;
            }
            else if(three > five){
                //multi.add(five);
                plus += five;
                five += 5;
            }
            else{
                plus += three;
                three += 3;
                five += 5;
            }
            //System.out.print(plus);
        }
        System.out.print(plus);
    }
}
