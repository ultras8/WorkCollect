import java.lang.Math;
import java.util.Arrays;
public class DeadFishSwim {
    public static void main(String[] args) {
        /*
        i increments the value (initially 0) 
        -plus 
        d decrements the value
        -minus
        s squares the value
        -power
        o outputs the value into the return array
        -print
        */
        String data = "iiisdoso";
        int count = 0, lengthArr = 0;
        for(int j = 0; j < data.length(); j++)
            if(data.charAt(j)=='o') lengthArr++;
        //int[] arr = new int[data.length() - data.replace("o", "").length()];
        int[] arr =new int[lengthArr];
        int k = 0;
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i)=='i') count++;
            else if(data.charAt(i)=='d') count--;
            else if(data.charAt(i)=='s') count *= count;
            else if(data.charAt(i)=='o'){ arr[k] = count; k++; }
            System.out.println(count);
        }
        System.out.print(Arrays.toString(arr));
        
    }
}
/*
for(char letter : data.toCharArray()) {
    switch(letter) {
        case 'i': value++; break;
        case 'd': value--; break;
        case 's': value *= value; break;
        case 'o': result.add(value); break;
        default: throw new IllegalArgumentException("Not valid code letter");
    }
}
*/
