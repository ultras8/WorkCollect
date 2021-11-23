public class GreedisGood {
    public static void main(String[] args) {
        int[] dice = {2,4,4,5,4};
        int[] arrCount = new int[7];
        int point = 0;
        for(int dick : dice) arrCount[dick]++;
        /*for(int i = 1; i <= 6; i++){
            for(int j = 0; j < 5; j++){
                if(i == dice[j]) arrCount[i]++;
            }
        }*/
        for(int k = 1; k <= 6; k++){
            if(arrCount[k] >= 3){
                if(k == 1) point += (1000);
                else point += (k * 100);
                arrCount[k] -= 3;
            }
        }
        while(arrCount[1] > 0 || arrCount[5] > 0){
            if(arrCount[1] >= 1){
                point += 100;
                arrCount[1]--;
            }
            if(arrCount[5] >= 1){
                point += 50;
                arrCount[5]--;
            }
        }
        System.out.println(point);
    }
}
/*
int n[] = new int[7];
for (int d : dice) n[d]++;
return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
*/