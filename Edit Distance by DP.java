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

    // Tabulation.
    public static int editDistance(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        // initialize(Base Cases).
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0){  //0th row.
                    dp[i][j] = j;
                }
                if(j == 0){  // 0th col.
                    dp[i][j] = i;
                }
            }
        }

        // filling.
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){  // same.
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i][j-1] +1;   // left +1    // addition
                    int del = dp[i-1][j] +1;  // upper +1    // delete
                    int rep = dp[i-1][j-1] +1;// diagonal +1    // replacment.
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str1 = "intention";
        String str2 = "execution";
        System.out.println(editDistance(str1, str2));
    }
}
