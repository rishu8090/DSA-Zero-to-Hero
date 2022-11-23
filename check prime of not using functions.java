import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       // boolean f = isprime( n);
        System.out.println(isprime(n));
        primeInRange(n);
         
    }
    public static boolean isprime(int  n){
        if(n == 2){
            return true;
        }for( int i = 2; i <= Math.sqrt(n); i++){
          if (n % 2 == 0){
            return false;
          }
        }
        return true;
    }
    public static void primeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isprime(i)){ // when becomes true print the i
                System.out.print( i +" ");
            }
          //  System.out.println();
        }
    }
}
