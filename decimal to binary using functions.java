import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println(DectoBin(n));

    }
    public static int DectoBin(int n){
        int rv= 0;
        int p = 0;
        while(n > 0){
         int dig = n % 2;
            rv = rv + dig * (int)Math.pow(10,p);
            p++;
            n = n/2;
        }
        return rv;
    }
}
