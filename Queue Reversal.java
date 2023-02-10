import java.util.*;
public class App {

    public static void QueueReversal(Queue <Integer> q){
        
        Stack <Integer> s = new Stack<>();          // T.C. = O(n)
                                                   //  S.C. = O(n)
            while(!q.isEmpty()){
             s.push(q.remove());
            }
            while(!s.isEmpty()){                                    
               q.add(s.pop());
            }             
        }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        QueueReversal(q);
       // System.out.println(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
         }
}
}
