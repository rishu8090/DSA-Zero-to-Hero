import java.util.Scanner;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a  = 6;
        int b = 7;
        swap(a ,b);
    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a :" + a);
        System.out.println("Value of b :"+ b);
    }
}
