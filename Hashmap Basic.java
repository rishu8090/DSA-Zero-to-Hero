import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HashMap<String ,Integer > hm = new HashMap<>();
        hm.put("China" , 150);
        hm.put("India" , 100);
        hm.put("Nepal" , 12);    // hashmap is a unordered Data Structure.

        System.out.println(hm);

        // Get - O(1);
        System.out.println(hm.get("India"));  // 100 otherwise null.

        // Contains Key - O(1);
        System.out.println(hm.containsKey("India"));  // True
        System.out.println(hm.containsKey("Bhutan"));  // False

        // Remove - O(1);
          // hm.remove("China");
        System.out.println(hm);

        System.out.println(hm.size());  // 2   {Size function}

        System.out.println(hm.isEmpty());  // false.

      //  hm.clear();    // clear all data.
        System.out.println(hm); // returns empty HashMap.



        // Iteration on HashMaps.
        Set<String> keys = hm.keySet();  // Changes HashMap to HashSet.
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key " + k + " , Value =" + hm.get(k));
        }
    }
}

// LinkedHashMap
// LinkedHashMap have all feature of HashMap ,with an additional feature,
// that key pair are added in the insertion order.
//  LinkedHashMap have same implementation and T.C. of hashMap.
// LinkedHashMap used doubly LinkedList whereas hashMap uses LinkedList.
// LinkedHashMap<K,V> lhm = new LinkedHashMap<>();

//  TreeMap
// TreeMap have al feature of HashMap, with an additional featue, 
// that key pair are added in sorted order.
// TreeMap have same implementation but have O(log n) T.C. due to sorting in all operations.
// TreeMap used Red-Black Trees(Self - balancing BST) for implementations.
//  TreeMap<K,V> Tm = new TreeMap<>();
