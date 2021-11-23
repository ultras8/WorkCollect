public class ValidParen {
    public static void main(String[] args) {
        String parens = "())(";
        int count = 0;
        for(int i = 0; i < parens.length(); i++){
            if(count == -1) break;
            if(parens.charAt(i) == '(') count++;
            else if(parens.charAt(i) == ')') count--;
        }
        System.out.println((count == 0)?true : false);
    }
}
        //                   1     2        3     4  5
        //1 0 1 0 1 0 1 2 3  2 3   2 3   4  3 4   3  2  1  0
        //( ) ( ) ( ) ( ( (  ) (   ) (   (  ) (   )  )  )  )  (   )
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  21 22
        //1 2 1 2 1 0 1 2 3 2 3 2 1 2 1 0
        //          5             11     13
        //0         5 6 7    
        //    1   1 0       1   2     3
        //1 2 2 3 3 1 4 5 6 6 7 7 5 8 8 4
        //( ( ) ( ) ) ( ( ( ) ( ) ) ( ) )
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
