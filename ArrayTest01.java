import java.util.Scanner;
import java.util.Arrays;
public class ArrayTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp;
        int cntS = 0;
        int cntB = 0;
        int[] arrOri = new int[n];
        int[] arrNew = new int[n];
        for(int i = 0;  i < n ; i++){
            arrOri[i] = sc.nextInt();
        }
        for(int j = 0, p = n-1; j < arrOri.length/2 && p >= 0; j++, p--){
            tmp = arrOri[j];
            arrOri[j] = arrOri[p];
            arrOri[p] = tmp;
        }
        for(int k = 0; k < n; k++){
            System.out.print(arrOri[k]+" ");
        }
        //System.out.print(Arrays.toString(arrOri));
    }
}
