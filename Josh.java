import java.util.Scanner;
public class Josh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String message = "Dear Jonathan. Sorry for your mother's death. Your friend Alex.";
        //int countn = 0;
        //String message = sc.nextLine();
        String messlow = message.toLowerCase();
        //String messup = "";
        messlow = messlow.replaceAll("jonathan", "danny");
        //System.out.print(messlow);
        if(message.length() <= 1000 && message.length() > 0){
            for(int i = 0; i < message.length()-1; i++){
                System.out.print(messlow.charAt(i));
                /*countn++;
                if(countn == 1) messup += messlow.substring(countn).toLowerCase();
                else if(messlow.charAt(i) == ' '){
                    if(messlow.charAt(i-1) == '.')countn = 0;
                }
                else messup += messup.charAt(i);
                messup += messlow.charAt(i);*/
            }
            //messup.replaceAll("alex", "Alex");
        }
        //System.out.print(messup);
    }
}
