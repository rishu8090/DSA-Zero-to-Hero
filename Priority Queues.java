import java.util.*;
public class App {

    static class Student implements Comparable<Student>{  // overriding
        String name;   // here Comparable is a special class which is describe in utility package.
        int rank;     //   we havae only inherites its property for comparing our object(Student).
        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
/*         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for reverse Order.
//                                // by default, it is in assending order.
        pq.add(3);
        pq.add(2);
        pq.add(6);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
 */

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A" , 7));
        pq.add(new Student("B" , 2));
        pq.add(new Student("C" , 9));
        pq.add(new Student("D" , 1));
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank );
            pq.remove(); 
        }

    }
}
