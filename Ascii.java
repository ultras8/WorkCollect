import java.util.Arrays;
public class Ascii {
    public static void main(String[] args) {
        String word = "Boo!";
        int count = 0;
        char[] charac = word.toCharArray();
        for(int i = 0; i < charac.length; i++){
            int n = charac[i];
            count += n;
        }
        System.out.println(count);
    }
}
