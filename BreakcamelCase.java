public class BreakcamelCase {
    public static void main(String[] args) {
        String input = "";
        String came = "";
        String[] brk = input.split("(?=[A-Z])");
        for(int i = 0; i < brk.length; i++){
            came += brk[i];
            if(i == (brk.length)-1) continue;
            else came += " ";
        }
        System.out.println(came);
        /*
        class Solution {
            public static String camelCase(String input) {
                return input.replaceAll("([A-Z])", " $1");
            }
        }
        */

    }
}