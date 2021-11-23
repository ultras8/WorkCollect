import java.util.Scanner;
public class Paihaitung {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length = sc.nextInt();
        int[] locatiA = new int[3]; int[] locatiB = new int[3];
        int[] symboArr = new int[3];
        int dot = 0,line = 0,minus = 0; 
        for(int i = 0; i < 3; i++)
            locatiA[i] = sc.nextInt();
        for(int j = 0; j < 3; j++)
            locatiB[j] = sc.nextInt();
        for(int k = 0; k < length; k++){
            char symbo = sc.next().charAt(0);
            if(symbo == '.') dot++;
            else if(symbo == '|') line++;
            else if(symbo == '-') minus++;
        }
        for(int l = 0; l < 3; l++){
            if(locatiA[l] > locatiB[l]) symboArr[l] = locatiA[l] - locatiB[l];
            else symboArr[l] = locatiB[l] - locatiA[l];
        }
        if(dot >= symboArr[0] && line >= symboArr[1] && minus >= symboArr[2]) System.out.println("1");
        else System.out.println("-1");
    }
}
