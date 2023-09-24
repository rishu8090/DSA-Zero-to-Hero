public class App {
    public static int LCS(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        // initialization.
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < m+1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static int StringConversion(String str1,  String str2){
        int LCSlength = LCS(str1, str2);
        int str1Length = str1.length();
        int str2Length = str2.length();

        int x = str1Length - LCSlength;  // deletion.
        int y = str2Length - LCSlength;  // addition.

        return x+y;
    } 

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str1 = "abcdef";
        String str2 = "aceg";
        System.out.println(LCS(str1, str2));
        System.out.println(StringConversion(str1, str2));
    }
}
