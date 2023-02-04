import java.util.*;
public class App {

    public static boolean isValid(String str){

        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // For opening parentheses.
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } 
            else{ // For if str have only closing parentheses " ( , { , ["
                if(s.isEmpty()){
                    return false;
                }  
                if((s.peek() == '(' && ch == ')')     //  ()        // if pair forms
                || (s.peek() == '{' && ch == '}')    //  {}
                || (s.peek() == '[' && ch == ']')){ // []
                    s.pop();
                }else{                                            // if pair does'nt forms
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str = "({})[]";
        System.out.print(isValid(str));
    }
}
