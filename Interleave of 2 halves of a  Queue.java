import java.util.*;
public class App {

    public static void interleave(Queue<Integer> q){

        Queue <Integer> firsthalf = new LinkedList<>();
        int size = q.size();
        for(int i = 0 ; i < size/2; i++){
          firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){              // T.C = O(n);
          q.add(firsthalf.remove());             //  S.C = O(n);
          q.add(q.remove()) ;
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
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
