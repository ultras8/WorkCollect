import java.util.Arrays;
public class Matrix{
    public static void main(String[] args) {
        int a[][]={{1,-1,3},{2,0,1},{0,2,-5}};
        int b[][]={{1,0,1},{-1,1,3},{2,4,0}};
        int c[][]={{1,1,0},{-1,-4,8},{2,2,2}};

        int rone[][]=new int[3][3];
        int rtwo[][]=new int[3][3];

        System.out.println("Result of matrix(a) * matrix(b)");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                rone[i][j] = a[i][j]*b[j][i];
            }
        }
        for (int[] pin1 : rone)
            System.out.println(Arrays.toString(pin1));

        System.out.println("---------------------------------------");
        System.out.println("Result of matrix(a) * matrix(c)");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                rtwo[i][j] = a[i][j]*c[j][i];
            }
        }
        for (int[] pin2 : rone)
            System.out.println(Arrays.toString(pin2));
    }
}