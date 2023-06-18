// HashSet is a special type of DS,
// in which no duplicate elements are allowed
// HashSet is a unordered DS and
// also null value is allowed not like HashSet.
// HashSet are implements using HashMap.
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
 /*      HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(5);

        System.out.println(set);
        System.out.println(set.size());

        
        set.remove(2);
        set.clear();
        if(set.contains(2)){
            System.out.print("Yes");
        }

        System.out.println(set.isEmpty());

        */


        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Lucknow");
        cities.add("Noida");
        cities.add("Gurugram");
        
        Iterator i = cities.iterator();
        while(i.hasNext()){   // in starting, i points to Null;
            System.out.println(i.next());
        }

        for( String city : cities){
            System.out.println(city);
        }
    }
}

// LinkedHashSet
// LinkedHashSet have all feature of HashMap ,with an additional feature,
// that key  are added in the insertion order.
//  LinkedHashSet have same implementation and T.C. of hashMap.
// LinkedHashSet used doubly LinkedList whereas hashMap uses LinkedList.
// LinkedHashSet<K> lhm = new LinkedHashSet<>();

// TreeSet
// TreeSet have al feature of HashMap, with an additional featue, 
// that key  are added in sorted order.
// TreeSet have same implementation but have O(log n) T.C. due to sorting in all operations.
// TreeSet used Red-Black Trees(Self - balancing BST) for implementations.
//  TreeSet<K> Tm = new TreeSet<>();
