   import java.util.ArrayList;
import java.util.*;
public class App {
    public  class StackB{
        static class Stack{
            static ArrayList<Integer> list = new ArrayList<>();

            // is Empty fucntion.
            public static boolean isEmpty(){
                return list.size() == 0;
            }
            // push
            public static void push(int data){
                list.add(data);
            }
            // pop
            public static int pop(){
                int top = list.get(list.size() -1);
                list.remove(list.size() -1);
                return top;
            }
            // peek
            public static int peek(){
                return list.get(list.size() -1);
            }
            }
        }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            // s.remove(s.peek());
            s.pop();
        }
    }
}
