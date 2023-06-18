import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        // Union
        for(int i = 0; i < arr1.length; i++){  // add arr1 in set
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){  // add arr2 in set
            set.add(arr2[i]);
        }

        System.out.println("Union set size is: " + set.size());

        // Intersection
        set.clear();
        
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        
        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection set size is: " + count);
    }
}
