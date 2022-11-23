import java.util.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your upper no.");
        int n = scn.nextInt();
        System.out.println("Enter your lower no.");
        int r = scn.nextInt();
         int a = factorial(n);
         int b = factorial(r);
         int c = factorial(n-r);
         int ans = a / (b * c);
          
         System.out.println( n + "C" + r + "="  + ans);
    }
    public static int factorial( int n){
        int ans = 1;
        for( int i = 1; i <= n; i++){
            ans = ans * i;
        }
        return ans;
    }
}
