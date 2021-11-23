public class SecretCode02 {
    public static void main(String[] args) {
        String text = "foxfoxMyuMyu|taptapMyutap";
        int word[][] = new int[text.length() + 1][text.length() + 1];
        String pass = "";
        int length = 0, index = 0, i, j, check = 0, count = 0;
        for(i = 0; i < text.length(); i++)
            if(text.charAt(0) == text.charAt(i)) count++;
        if(count == text.length()) check = 1;
        else{
            for (i = 1; i <= text.length(); i++) {
                for (j = i + 1; j <= text.length(); j++) {
                    if (text.charAt(i - 1) == text.charAt(j - 1) && word[i - 1][j - 1] < (j - i)) {
                        word[i][j] = word[i - 1][j - 1] + 1;
                        if (word[i][j] > length) {
                            length = word[i][j];
                            index = Math.max(i, index);
                        }
                    } else word[i][j] = 0;
                }
            }
            if (length > 0) {
                for (i = index - length + 1; i <= index; i++) {
                    pass += text.charAt(i - 1);
                }
            }else check = 3;
        }
        if(check == 1){
            for(i = 0; i < (text.length()/2); i++)
                pass += text.charAt(i);
            System.out.print(pass);
        }
        else if(check == 3) System.out.print("I'm find");
        else System.out.print(pass);
    }
}
