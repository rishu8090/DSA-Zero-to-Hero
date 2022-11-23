import java.util.*;
public class App {     public static int BintoDec(int a){
    int rv = 0; 
    int p = 0;
    while(a > 0){
     int dig = a % 10;
     rv = rv + (dig * (int)Math.pow(2,p));
     p++;
     a = a / 10 ;
    }
     return rv;
 }
 public static void main(String[] args) throws Exception {
     System.out.println("Hello, World!");
     Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();
   // System.out.println( fact(a));
   //fact(a);
    System.out.println( BintoDec(a));
 }
    }

