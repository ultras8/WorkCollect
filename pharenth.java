/*
Valid Parentheses
codewar 
*/
import java.util.ArrayList;
public class pharenth {
    public static void main(String[] args) {
        ArrayList<Character> parenbuck = new ArrayList<>();
        String parens = "";
        int count = 0;
        int length = 0;
        for(int i = 0; i < parens.length(); i++){
            if(parens.charAt(i) == '(' || parens.charAt(i) == ')'){
                parenbuck.add(parens.charAt(i));
                length++;
            }
        }
        for(int j = 0; j < length; j++){
            if(parenbuck.get(j) =='(') count++;
            else if(parenbuck.get(j) ==')') count--;
        }
        System.out.println(count);
        
    }
}
