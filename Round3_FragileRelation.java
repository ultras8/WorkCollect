import java.util.Scanner;
import java.util.ArrayList;
public class Round3_FragileRelation {
    public static boolean checkSameLocal(int j, ArrayList<Integer> localCollect,int count){
        for(int i = 0; i < count; i++){
            if(localCollect.get(i) == j){
                
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int v = sc.nextInt(); int e = sc.nextInt();
        int start = sc.nextInt(); int stop = sc.nextInt();
        long t = sc.nextLong();
        int count = 0, tmp = 0;

        int[][] relationGrid = new int[v][v];
        ArrayList<Integer> countLineCollect = new ArrayList<>();
        ArrayList<Integer> localCollect = new ArrayList<>();
        ArrayList<Integer> RPCollect = new ArrayList<>();

        if(v > 1){
            for(i = 0; i < v; i++){
                int xtemp = sc.nextInt();
                int ytemp = sc.nextInt();
                int ztemp = sc.nextInt();
                relationGrid[xtemp][ytemp] = ztemp;
                relationGrid[ytemp][xtemp] = ztemp;
            }
            for(i = 1; i < v; i++){
                if(relationGrid[start][i] != 0){
                    if(i == stop){
                        countLineCollect.add(1);
                        RPCollect.add(relationGrid[start][i]);
                    }
                    else {
                        count++;
                        localCollect.add(i);
                        tmp += relationGrid[start][i];
                    }
                }
            }
            RPCollect.add(tmp);
            countLineCollect.add(count);
            int tempCount = count;
            i = 1;
            while(i == stop){
                for(i = 1; i < count; i++){
                    for(j = 1; j < v; j++){
                        if(relationGrid[localCollect.get(i)][j] != 0){
                            if(checkSameLocal(j, localCollect, tempCount)){

                            }else{
                                count++;
                                localCollect.add(j);
                            }
                        }
                    }
                }
            }
            
        }
        /*

        */








        /*
        E—D ทั้งหมด 1 ความสัมพันธ์ มีผลรวมของ RP = 4
        B—E และ C—E ทั้งหมด 2 ความสัมพันธ์ มีผลรวมของ RP = 3
        A—B และ C—E ทั้งหมด 2 ความสัมพันธ์ มีผลรวมของ RP = 6
        A—C และ B—E ทั้งหมด 2 ความสัมพันธ์ มีผลรวมของ RP = 5
        A—B และ A—C ทั้งหมด 2 ความสัมพันธ์ มีผลรวมของ RP = 8
        */
    }
}
/*
5
5
1 4
10
1 2 5
1 3 3
2 5 2
3 5 1
4 5 4
Output 2
   0 1 2 3 4 5
0  0 0 0 0 0 0
1  0 0 5 3 0 0
2  0 0 0 0 0 2
3  0 0 0 0 0 1 
4  0 0 0 0 0 4
5  0 0 0 0 0 0
---------------
   0 1 2 3 4 5
0  0 0 0 0 0 0
1  0 0 5 3 0 0
2  0 5 0 0 0 2
3  0 3 0 0 0 1 
4  0 0 0 0 0 4
5  0 0 2 1 4 0
*/