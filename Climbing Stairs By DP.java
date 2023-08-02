import java.util.*;
public class App {

    public static int climbStairByRecurr(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return climbStairByRecurr(n-1) + climbStairByRecurr(n-2);
    }

    // Memorization.
    public static int climbStairByMemo(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){ //  if already calculated.
            return dp[n];
        }

        dp[n] = climbStairByMemo(n-1, dp) + climbStairByMemo(n-2, dp);
        return dp[n];
    }

    // Tabulation.
    public static int climbStairByTabu(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
            dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        // System.out.println(climbStairByRecurr(n));
        // System.out.println(climbStairByMemo(n, dp));
        System.out.println(climbStairByTabu(n));
    }
}
