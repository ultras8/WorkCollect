import java.util.ArrayList;
import java.util.Scanner;

public class Scoreb {

  public static void main(String[] args) {
    ArrayList<Integer> scoreb = new ArrayList<>();
    ArrayList<Integer> myscr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] scoreb01 = new int[n];
    int tmp, count = 1;

    for (int i = 0; i < n; i++) {
      scoreb01[i] = sc.nextInt();
    }
    for (int j = 1; j < n; j++) {
      if (scoreb01[j] != scoreb01[j - 1]) {
        scoreb.add(scoreb01[j - 1]);
        count++;
      }
    }
    scoreb.add(scoreb01[n - 1]);
    int m = sc.nextInt();
    for (int k = 0; k < m; k++) {
      int scr = sc.nextInt();
      for (int g = 0; g < count; g++) {
        if (scr >= scoreb.get(g)) {
          myscr.add(g + 1);
          break;
        } else if (scr < scoreb.get(count - 1)) {
          myscr.add(count + 1);
          break;
        }
      }
    }
    for (int y = 0; y < m; y++) {
      System.out.println(myscr.get(y));
    }
  }
}
