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

    public static int coinChange(int coin[] , int sum){
        int n = coin.length;
        int dp[][] = new int[n+1][sum+1];
        // initialization.
        // i = coin ,  j = sum/ change.
        for(int i = 0; i < n+1; i++){  // first coloum.
            dp[i][0] = 1;
        }
        for(int j = 1; j < sum+1; j++){  // first row. except first element.
            dp[0][j] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                int C = coin[i-1]; // to ith coin
                if( C <= j){ // valid.
                    dp[i][j] = dp[i][j- C] + dp[i-1][j];
                }else{ // invalid.
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int coin[] = {2,5,3,6};
        int sum = 10;
        System.out.println(coinChange(coin, sum));
    }
}
