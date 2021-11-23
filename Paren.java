import java.util.Scanner;
import java.util.Arrays;
public class Paren {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String paren = sc.next();
        int[] num = new int[paren.length()];
        int[] count2 = new int[paren.length()];
        int count = 0, num2 = 0;
        
        if((paren.length()%2) == 0){
            if(paren.charAt(0) == '(' && paren.charAt(paren.length()-1) == ')'){
                for(int i = 0; i < paren.length(); i++){
                    if(paren.charAt(i) == '('){
                        count++;
                        num2++;
                        num[i] = count;
                        count2[count]++;
                    }
                    else if(paren.charAt(i-1) == '('){
                        num2--;
                        num[i] = count;
                        count2[count]++;
                    }
                    else num2--;
                    if(num2 == 0){
                        for(int k = 0; k < paren.length(); k++){
                            if(num[k] == 0){
                                for(int j = k; j >= 0; j--){
                                    if(count2[j]==1){
                                        num[k] = j;
                                        count2[j]++;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else if(num2 < 0){
                        System.out.print("Pharentheses do not match!");
                        System.exit(0);
                    }
                }
                System.out.print(Arrays.toString(num));
            }
            else System.out.print("Pharentheses do not match!");
        }
        else System.out.print("Pharentheses do not match!");
    }
}