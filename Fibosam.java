import java.util.ArrayList;
import java.util.Arrays;
public class Fibosam {
    public static void main(String[] args){
        //ArrayList<Integer> fibo = new ArrayList<>();
        double[] a = {0,0,1};
        double[] s = Arrays.copyOf(a, 10);
        for(int i = 3; i < 10; i++){
            s[i] = s[i-1]+s[i-2]+s[i-3];
        }
        System.out.println(Arrays.toString(s));
        /*int j = 0;
        fibo.add(a[0]);
        fibo.add(a[1]);
        fibo.add(a[2]);
        for(int i = 0; i < 7; i++){
            fibo.add(fibo.get(j)+fibo.get(j+1)+fibo.get(j+2));
            j++;
        }
        System.out.print(fibo);*/
    }
}
