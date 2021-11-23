public class Wub{
    public static void main (String[] args){
        String sing = "R L";
        String original = sing.replaceAll("WUB", " ");
        original = original.trim().replaceAll(" +", " ");
        
        System.out.print(original);
    }
}
