import java.util.Scanner;
import java.util.ArrayList;
public class SecretCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> maxWord = new ArrayList<>();
        String text = "meyoumeyoumeyouyoumeyoume"; 
        String word = "", pass = "", tempS = "";
        //String text = sc.nextLine();
        int i ,j ,k;
        int check = 0, count = 0;
        if(text.length() > 1 && text.length() <= 100){
            for(i = 0; i < text.length(); i++)
                if(text.charAt(0) == text.charAt(i)) count++;
            if(count == text.length()) check = 1;
            else{
                count = 0;
                i = 0;
                int max = Integer.MIN_VALUE;
                for(i = 0; i < text.length(); i++){
                    if(i > 3 && text.charAt(0) == text.charAt(i)){
                        for(j = i; j < text.length() ; j++){
                            pass += text.charAt(j);
                            if(word.equals(pass)){ check = 2; break; }
                        }
                        if(!(word.equals(pass))) pass = "";
                    } else word += text.charAt(i);
                    count++;
                }
                
            }
        }
    }
}
/*else if(count >= 3){
    count = 0;
    for(i = 0; i < text.length(); i++){
        if(text.charAt(0) == text.charAt(i)) count++;
        else break;
    }
    int temp = count;
    for(j = i; j < text.length(); j++){
        if(text.charAt(i) == text.charAt(i)) temp++;
        else break;
    }
    if(count + temp >= text.length()/2){
        check = 3;
        if(count >= temp){
            for(i = 0; i < count; i++){
                pass+=text.charAt(i);
            }
        }else{
            for(j = i; j < text.length(); j++){
                pass+=text.charAt(i);
            }
        }
    }
}*/
/* original = original.trim().replaceAll(" +", " "); */
/*
String pass = "", word = "";
        int i ,j;
        int check = 0,count = 1;
        if(text.length() > 1 && text.length() <= 100){
            for(i = 1; i < text.length(); i++){
                if(text.charAt(0) == text.charAt(i)) count++;
                else break;
            }
            if(count == text.length()) check = 1;
            if(count >= text.length()/2){
                check = 3;
            }
            if(check == 0){
                count = 0;
                for(i = 0; i < text.length(); i++){
                    if(i > 3 && text.charAt(0) == text.charAt(i)){
                        for(j = i; j < text.length() ; j++){
                            pass += text.charAt(j);
                            if(word.equals(pass)){ check = 2; break; }
                        }
                        if(!(word.equals(pass))) pass = "";
                    } else word += text.charAt(i);
                    count++;
                }
            }
            if(check == 1){
                for(i = 0; i < (text.length()/2); i++)
                    pass += text.charAt(i);
            }
            if(check == 3){
                for(i = 0; i < text.length(); i++){
                    if(text.charAt(0) != text.charAt(i)) break;
                }
            }
            if(check == 0) System.out.print("I'm find");
            else System.out.print(pass.trim());
            System.out.println(check);
        }
*/
/*
while(i <= text.length()){
                    if(i > 0 && word.charAt(0) == text.charAt(i)){
                        for(j = i; j < text.length() ; j++){
                            pass += text.charAt(j);
                            //System.out.println(word + " " + pass);
                            if(word.equals(pass)) break;
                        }
                        word = "";
                        k = 0;
                        for(j = 0; j < text.length(); j++){ 
                            if(k == pass.length()-1) k = 0;
                            System.out.println(pass.charAt(k) + " " + text.charAt(j));
                            if(pass.charAt(k) == text.charAt(j)){
                                tempS += text.charAt(j);
                                if(tempS.equals(pass)){
                                    tempS = "";
                                    count++;
                                }
                            }else{
                                i = j;
                                word += text.charAt(j);
                                break;
                            } 
                            k++;
                        }
                        if(max < count){
                            max = count;
                            count = 0;
                            maxWord.add(pass);
                        }
                        pass = "";
                        System.out.println(word);
                    }else word += text.charAt(i);
                    i++;
                }
*/
