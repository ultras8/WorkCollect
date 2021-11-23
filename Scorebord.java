import java.util.Scanner;
import java.util.ArrayList;
public class Scorebord {
    public static void main(String[] args) {
        ArrayList<Integer> scoreAll = new ArrayList<>();
        //int[] scoreAll = new int[n];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int j = 1;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            if(i > 0){
                if(tmp != scoreAll.get(i-j)){
                    scoreAll.add(tmp);
                    //j++;
                }
            }
            else scoreAll.add(tmp);
        }
        System.out.println(scoreAll);
    }
}
