import java.util.Scanner;
import java.util.Arrays;
public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paren = sc.next();
        int[] count = new int[paren.length()];
        int count2 = 0, num1 = 0, num2 = 0;
        if((paren.length()%2) == 0){
            for(int i = 0; i < paren.length(); i++){
                if(paren.charAt(i) == '('){
                    count2++;
                    num1++;
                    count[i] = count2;
                }
                else if(paren.charAt(i) == ')'){
                    num1--;
                    if(paren.charAt(i-1) == '('){
                        count[i] = count2;
                        num2++;
                    }
                    else if(paren.charAt(i-1) == ')'){
                        count[i] = count[i - ((num2*2)+1)];
                        if(num1 == 0) num2 = 0;
                        else num2++;
                        //18 - (11)
                        //13
                    }
                }
            }
            System.out.print(Arrays.toString(count));
        }
        //                   1     2        3     4  5
        //1 0 1 0 1 0 1 2 3  2 3   2 3   4  3 4   3  2  1  0
        //( ) ( ) ( ) ( ( (  ) (   ) (   (  ) (   )  )  )  )  (   )
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  21 22
        //1 2 1 2 1 0 1 2 3 2 3 2 1 2 1 0
        //          5             11     13
        //0         5 6 7    
        //    1   1 0       1   2     3
        //1 2 2 3 3 1 4 5 6 6 7 7 5 8 8 4
        //( ( ) ( ) ) ( ( ( ) ( ) ) ( ) )
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        else System.out.print("Pharentheses do not match!");
    }
}