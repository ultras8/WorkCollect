import java.util.Scanner;

public class Main {
    public int dfs(int[][] islandGrid, int i, int j){
        if(i < 0 || i >= islandGrid.length || j < 0 || j >= islandGrid[i].length || islandGrid[i][j] == 0){
            return 0;
        }
        islandGrid[i][j] = 0;
        int count = 1;
        count += dfs(islandGrid, i+1, j);
        count += dfs(islandGrid, i-1, j);
        count += dfs(islandGrid, i, j+1);
        count += dfs(islandGrid, i, j-1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main op = new Main();
        int m = sc.nextInt(); int n = sc.nextInt();
        int [][] islandGrid = new int[m][n];
        int i, j, max = Integer.MIN_VALUE;
        int temp = 0;
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                islandGrid[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < islandGrid.length; i++){
            for(j = 0; j < islandGrid[i].length; j++){
                if(islandGrid[i][j] == 1){
                    if(op.dfs(islandGrid, i, j) > max) max = temp;
                }
            }
        }
        System.out.print(max);
    }
}
