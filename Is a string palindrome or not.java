 import java.util.*;
public class App {

    public static boolean palindrome(String name){
        for(int i = 0; i < name.length()/2; i++){
            int n = name.length();
            if( name.charAt(i) != name.charAt(n -1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String name = "racecar";
      System.out.print( palindrome(name));
    }
}
