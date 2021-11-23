import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Round3_BitterPowder {
  public static BigDecimal calculateAns(BigDecimal m){
    MathContext mc = new MathContext(100);
    BigDecimal ansA1 = m.sqrt(mc).sqrt(mc);
    BigDecimal aConvert = m.subtract(BigDecimal.valueOf(Math.pow(10, -16)), mc);
    BigDecimal ansA2 = aConvert.sqrt(mc).sqrt(mc);
    BigDecimal powerTwo = m.pow(2);
    BigDecimal temp = m.multiply(BigDecimal.valueOf(Math.pow(10, -16)), mc);
    BigDecimal Beforans3 = powerTwo.subtract(temp);
    BigDecimal tempa1minusa2 = ansA1.subtract(ansA2, mc);
    BigDecimal ansA3 = Beforans3.sqrt(mc).sqrt(mc);
    BigDecimal ret = tempa1minusa2.divide(ansA3, mc);
    return ret;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int start = sc.nextInt();
    int end = sc.nextInt();
    String test = "";

    BigDecimal b = new BigDecimal(0);

    for(int i = start; i <= end; i++){
      b  = b.add(calculateAns(new BigDecimal(i, new MathContext(100))));
    }
    b = b.multiply(new BigDecimal(2), new MathContext(7));

    String s = b.toString();
    for(int j = 0; j < s.length(); j++){
      if(s.charAt(j) == 'E') test += " x 10^";
      else test += s.charAt(j);
    }
    System.out.print(test);
  }
}
