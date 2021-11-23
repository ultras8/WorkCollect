public class Tol {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String result = "";
        for(int i = 0; i < num.length; i++){
            if (i == 0) 
                result += '(';
            else if (i == 3) 
                result += ") ";
             else if (i == 6) 
                result += '-';
            result += num[i];
        }
        System.out.print(result);
    }
  }