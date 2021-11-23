import java.util.Scanner;

public class Round3_meowGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = 0, MaxMeow = Long.MIN_VALUE;
        int n = sc.nextInt(), i;
        long[] A_Line = new long[n];
        for(i = 0; i < n; i++){
            A_Line[i] = sc.nextLong();
        }
        for(i = 0; i < n; i++){
            int j = i;
            while(j > 0){
                if( A_Line[j - 1] < A_Line[i] ) break;
                else count += A_Line[i];
                j--;
            } j = i;
            while(j < n-1){
                if(A_Line[j + 1] < A_Line[i] ) break;
                else count += A_Line[i];
                j++;
            }
            count += A_Line[i];
            if(MaxMeow < count) MaxMeow = count;
            count = 0;
        }
        System.out.print(MaxMeow);
    }
}
