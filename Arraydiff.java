import java.util.*;
public class Arraydiff {
    public static void main(String[] args){
        int[] a = {1, 2, 2};
        int[] b = {2};
        int count = 0;
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i = 0 ; i < a.length; i++){
            alist.add(a[i]);
            count++;
        }
        int n = a.length;
        for(int k = 0; k < b.length; k++){
            for(int j = 0; j < n ; j++){
                if(b[k] == alist.get(j)){
                    alist.remove(j);
                    j--;
                    n--;
                    count--;
                }
            }
        }
        System.out.println(alist.toString());
    }
}
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
---------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        loop:
        for (int num : a) {
            for (int i : b) if (num == i) continue loop;
            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/
