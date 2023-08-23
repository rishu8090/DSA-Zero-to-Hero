public class App {
    public static void print(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int RodCutting(int length[], int prices[], int totapRod ){
        int n = length.length;
        int dp[][] = new int[n+1][totapRod+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < totapRod+1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < totapRod+1; j++){
                if( length[i-1] <= j){// valid
                    dp[i][j] = Math.max(prices[i-1]+ dp[i][j -length[i-1]] , dp[i-1][j]);
                }else{// invalid.
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][totapRod];
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totalRod = 8;
        System.out.println(RodCutting(length, prices, totalRod));
    }
}
