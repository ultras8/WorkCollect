import java.util.Scanner;
import java.util.ArrayList;
public class Lastnine {
    public static void main(String[] args){
        ArrayList<String> ai = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, sum = 0;
        if(n >= 0 && n <= 1000){
            for(int i = 0; i < n; i++){
                ai.add(sc.next());
                count++;
            }
            for(int j = 0; j < count; j++){
                if(ai.get(j).charAt(ai.get(j).length()-1) == '9'){
                    sum += Integer.parseInt(ai.get(j));
                }
            }
            System.out.print(sum);
        }

    }
}
