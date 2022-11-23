import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int answere =product( 7, 3);
        System.out.println(answere);

         answere =product( 5, 2);
        System.out.println(answere);

    }
    public static int product( int a , int b){
        int prod = a * b ;
        return prod;
    }
}
