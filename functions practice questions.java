import java.util.*;
public class App {

    public static void average( ){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int p = scn.nextInt();
        int r = scn.nextInt();
        
        int avg = (n + p + r)/ 3;
        System.out.print("and your average is:" +avg);
        
    }
    public static boolean isEven(){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(num % 2 == 0){
            System.out.print("even");
            return true;
        }else{
            System.out.print("odd");
            return false;
        }
    }
    public static void intsum(){
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        while (n != 0){
        int ld = n % 10;
        sum = sum +ld ;
        n = n /10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        System.out.println("Hello, World!");
        // average();
       //  isEven();
       intsum();
    }
}
