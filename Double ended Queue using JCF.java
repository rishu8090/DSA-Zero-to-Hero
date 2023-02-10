import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Deque <Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
         System.out.println(deque);
         System.out.println(deque.getFirst());
         System.out.println(deque.getLast());
    }
}
