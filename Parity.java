import java.util.Scanner;
public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];
        String[] bit = new String[4];
        for(int i = 0; i < 4; i++){
            bit[i] = sc.next();
        }
        for(int i = 0; i < 8; i++){
            if(bit[0].charAt(i) == '1') count[0]++;
            if(bit[1].charAt(i) == '1') count[1]++;
            if(bit[2].charAt(i) == '1') count[2]++;
            if(bit[3].charAt(i) == '1') count[3]++;
        }
        for(int i = 0; i < 4; i++){
            System.out.print(bit[i]);
            if((count[i])%2 == 0) System.out.println(" 0");
            else System.out.println(" 1");
        }
    }
}
