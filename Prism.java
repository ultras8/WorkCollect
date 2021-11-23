import java.util.Scanner;
public class Prism {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n > 0 && n <= 10){
        int k = sc.nextInt();
        if(k >= 3 && k <= 20) System.out.print((999*2)+(999*k) +" ");
    }
  }
}
