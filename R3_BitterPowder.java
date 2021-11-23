import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class R3_BitterPowder {
  public static double calculateAns(double m){
    double ansA1 = Math.pow((double)m, 0.25);
    double aConvert = (double)m - (Math.pow((double)10,(double)-16));
    double ansA2 = Math.pow((double)aConvert,(double) 0.25);
    double Beforans3 = Math.pow((double)m, (double)2) - ((double)m * (Math.pow((double)10, (double)-16)));
    double tempa1minusa2 = (double)ansA1 - (double)ansA2;
    double ansA3 = Math.pow((double)Beforans3, 0.25);
    double ret = ((double)tempa1minusa2 / (double)ansA3);
    return ret;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int start = sc.nextInt();
    int end = sc.nextInt();
    //String test = "";

    double b = 0.0;
    double m = start;

    for(int i = start; i <= end; i++){
      b  += calculateAns((double)m);
    }
    System.out.println(b*2);
    /* b = b.multiply(new BigDecimal(2), new MathContext(7));

    String s = b.toString();
    for(int j = 0; j < s.length(); j++){
      if(s.charAt(j) == 'E') test += " x 10^";
      else test += s.charAt(j);
    }
    System.out.print(test); */
  }
}
