import java.util.Scanner;
public class MaxOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int length = sc.nextInt(); 
        int tern = sc.nextInt(); 
        int[] num = new int[length];
        int[] ans = new int[length];
        int count = 0;
        for(int i = 0; i < length; i++)
            num[i] = sc.nextInt();
        for(int j = 0; j < (length-tern)+1; j++){
            int max = Integer.MIN_VALUE, check = 0;
            for(int k = j; k < (j + tern); k++){
                if(num[k] > max){
                    max = num[k];
                    check = 2;
                }
            }
            if(j == 0){
                ans[count] = max;
                count++;
            } else{
                for(int l = 0; l < count;l++){
                    if(max == ans[l]){
                        check = 1;
                        break;
                    }
                }
                if(check == 2){
                    ans[count] = max;
                    count++;
                }
            }
        }
        for(int a = 0; a < count; a++){
            System.out.print(ans[a] + " ");
        }
    }
}
