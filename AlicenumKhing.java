import java.util.Scanner;
public class AlicenumKhing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turian = sc.nextInt();
        int ginger = sc.nextInt();
        int water = sc.nextInt();
        int trn = 1, gin = 2, wat = 2; 
        int countbox = 0;
        Boolean t = true;
        if(turian >= 0 && turian <= 300){
            if(ginger >= 0 && ginger <= 500){
                if(water >= 0 && water <= 500){
                    while(t){
                        if(turian >= (trn*6) && ginger >= (gin*6) && water >= (wat*6)){
                            turian -= (trn*6);
                            ginger -= (gin*6);
                            water -= (wat*6);
                            countbox++;
                        }
                        else if(turian >= (trn*2) && ginger >= (gin*2) && water >= (wat*2)){
                            turian -= (trn*2);
                            ginger -= (gin*2);
                            water -= (wat*2);
                            countbox++;
                        }
                        else if(turian >= trn && ginger >= gin && water >= wat){
                            turian -= trn;
                            ginger -= gin;
                            water -= wat;
                            countbox++;
                        }
                        else t = false;
                        //System.out.println(turian+" "+ginger+" "+water);
                    }
                    System.out.print(countbox);
                }
            }
        }
    }
}
