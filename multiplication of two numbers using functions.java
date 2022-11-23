import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = product( a , b); //actual parameters or arguments
        System.out.println("Product is :" + sum);
    }
    public static int product( int num1 , int num2){  // formal parameters or parameters
        int sum = num1 * num2 ;
        return sum;
    }
}
