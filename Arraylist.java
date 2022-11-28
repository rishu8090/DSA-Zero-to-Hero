import java.util.ArrayList;
import java.util.Collections;
public class App {

      public static void swap(ArrayList<Integer> list, int idx1 ,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2 , temp );
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        ///  Element adding in ArrayList  function.
        list.add(1); //O(1);
        list.add(2);
        list.add(8);
        list.add(6);
        System.out.println(list);

        // list.add(1,5);  // Another type of add function .
        //  System.out.println(list);   // in which first is index and 2nd is element.

        /// Get element in Arraylist function.
        //  int element = list.get(2); // O(1);
        // System.out.println(element);

        /// Remove element in ArrayList function.
        // int Remove = list.remove(1);  // O(n)
        // System.out.println(list);

        /// Set element in ArrayList function.
        // list.set(2,10);    // O(n)
        // System.out.print(list);

        /// is contains fuction in ArrayList .
        // System.out.println(list.contains(11));   // O(n).
        // System.out.println(list.contains(2));  // retruns a boolean ans,

        /// size of ArrayList function.
        // System.out.println(list.size());
        // for(int i =0; i < list.size();i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        /// print reverse of a Arraylist.
        // for(int i = list.size()-1; i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        /// find max. in an ArrayList
        // int max = Integer.MIN_VALUE;
        // for(int i =0; i < list.size(); i++){
        //      max = Math.max(max,list.get(i)); 
        // }
        // System.out.print( " max. element is :" +max);

         /// swap to elements in an ArrayList.
        //  int idx1 = 0; int idx2 = 2;
        //  System.out.println(list);
        //  swap(list,idx1, idx2);
        //  System.out.println(list);
      
        /// inbuilt sorting in an ArrayList
            // Collections.sort(list);   // assending order.
            // System.out.println(list);

            // Collections.sort(list,Collections.reverseOrder());
            // System.out.println(list);

    }     
}
