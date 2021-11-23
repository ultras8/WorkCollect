import java.util.Scanner;
public class Alphab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        String cd = sc.next();

        System.out.println(st);
        System.out.println(cd);
        if(check(cd, st)){
            System.out.print("The words share the base alphabet (");
            for(int i = 0; i < cd.length(); i++){
                System.out.print(cd.charAt(i));
                if(i < (cd.length()-1)){
                    System.out.print(", ");
                }
            }System.out.print(")");
        }
        else{
            System.out.println("The words do not share the same base alphabet");
        }
        sc.close();
    }
    public static boolean check(String cd, String st){
        int[] check01 = new int[cd.length()];
        int num = 0;
        for(int i = 0; i < cd.length(); i++){
            for(int j = 0; j < st.length(); j++){
                if(cd.charAt(i) == st.charAt(j)){
                    check01[i]++;
                }
            }
        }
        for(int i = 0; i < cd.length(); i++){
            if(check01[i] != 0) num++;
        }
        if(num == cd.length()) return true;
        else return false;
    }
}
