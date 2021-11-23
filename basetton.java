import java.util.ArrayList;
import java.util.Scanner;
public class basetton {
    public static void main(String[] args) {
        ArrayList<Integer> basemix = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        int count = 0;
        if(n >= 0 && n < 10000){
            if(base > 1 && base < 10){
                while(n > 0){
                    basemix.add(n % base);
                    n /= base;
                    count++;
                }
                for(int i = count-1; i >= 0; i--){
                    System.out.print(basemix.get(i));
                }
            }
        }
    }
}
