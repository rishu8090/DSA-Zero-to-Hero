public class App {

    public static int RecurrsionBasedFibo(int n){  // O(2^n).
        if( n == 0 || n == 1){
            return n;
        }
      return  RecurrsionBasedFibo(n-1) + RecurrsionBasedFibo( n-2);
    }

    // Memorization.(Top to Bottom Approach).
    public static int MemoFibo(int n , int dp[]){  //O(n).
        if( n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){ // it means fibo. is already calculated.
            return dp[n];
        }
        dp[n] = MemoFibo(n-1 , dp) + MemoFibo(n-2 , dp);
        return dp[n];
    }

    // Tabulation.( Bottom to Up approach).
    public static int TabuFibo(int n ){

        int dp[] = new int[n+1];
        dp[0] = 0; 
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n = 6;
        int dp[] = new int [n+1];  // by default at each place (0,0,0,0,0,0)
        // System.out.println(RecurrsionBasedFibo(n));

        // System.out.println(MemoFibo(n, dp));
        System.out.println(TabuFibo(n));
    }
}
