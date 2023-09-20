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

    public static int longestCommanSubstring(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        
        // initialisation.
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;  // 0th row
        }
        for(int j = 0; j < m+1; j++){
            dp[0][j] = 0;  // 0th col
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                    ans = Math.max(dp[i][j], ans);
                }
            }
        }
        print(dp);
        return ans;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";

        System.out.print( "LC substring length is :" + longestCommanSubstring(str1, str2));
    }
}
