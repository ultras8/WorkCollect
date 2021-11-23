import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;
public class SourceMemories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger temp = BigInteger.valueOf(1);
        BigInteger count = BigInteger.valueOf(1);
        if(n.equals(count)) System.out.println(0);
        else{
            for(int i = 2; i <= Math.pow(10, 18);i++){
                if(count.compareTo(m)>0 || count.equals(m)){
                    count = count.subtract(m);
                    break;
                }
                temp = temp.multiply(n);
                count = count.add(temp);
            }
            System.out.println(count);
        }
    }
}