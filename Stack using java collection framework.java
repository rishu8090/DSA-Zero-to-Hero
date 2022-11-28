import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
