import java.util.*;
import java.util.Scanner;
public class App {

    public static void printString(String name){
        for(int i = 0; i < name.length(); i++){
           System.out.print(name.charAt(i) + " ");
        }
           System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
       // String name = scn.next(); // for only one word.
        String name = scn.nextLine(); // for whole line.
        System.out.println(name);
        System.out.println(name.length());   // used for count no. char in the String.
        System.out.println(name.charAt(8)); // used for find char at any index.
        printString(name);
    }
}
