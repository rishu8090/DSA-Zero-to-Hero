import java.util.*;
public class App {

    public static boolean Duplicate(String str){
        Stack <Character> s = new Stack<>();

        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            // Closing.
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();   // opening pair.

                }
            }else{
                s.push(ch);
            }
        }
            return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(Duplicate(str));
        System.out.println(Duplicate(str2));
    }
}
