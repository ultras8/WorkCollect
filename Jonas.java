import java.util.Scanner;
public class Jonas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String message = "Dear Jonathan. Sorry for your mother's death. Your friend Alex. JONAthan";
        String message = sc.nextLine();
        if(message.length() <= 1000 && message.length() > 0){
            for(int i = 0; i <= message.length()-1; i++){
                if( message.charAt(i)=='n' || message.charAt(i)=='N' ){
                    try{
                        String check = message.substring(i-7, i+1);
                        if(check.equalsIgnoreCase("jonathan")){
                            message = message.replaceAll(check, "Danny");
                       }
                    }catch(Exception e){
                        continue;
                    }
                }
            }
        }
        System.out.print(message);

    }
}
