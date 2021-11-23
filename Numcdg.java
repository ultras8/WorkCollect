import java.util.Scanner;
import java.util.ArrayList;
public class Numcdg {
    public static void main(String[] args){
        ArrayList<Integer> ai = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int length = 0, count = 0;
            int m = sc.nextInt();
            int x = sc.nextInt();
            if(m > 0 && x > 1){
                if(m <= 1000 && x < 100){
                    for(int j = 0; j < m; j++){
                        ai.add(sc.nextInt());
                        length++;
                        //count += ai.get(j);
                    }
                    for(int j = 0;j < length; j++){
                        if((ai.get(j) % x) == 0){
                            count += ai.get(j);
                            count += x * (ai.get(j)/x);
                        }
                        else break;
                    }
                    System.out.print(count);

                }
            }
        }
    }
}
