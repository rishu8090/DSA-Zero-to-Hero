import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i]) + 1);   // for updation key frequency.
            }else{
                hm.put(arr[i] , 1);  // for firstly coming key
            }
        }

        Set<Integer> keySet = hm.keySet();
        for(Integer key : keySet){   // for each loop, which is used when,
            if(hm.get(key) > arr.length/3){   // here, n/3 is given in the question.
             
                System.out.println(key);  // we have to traverse all elements of DS.
                 // it will goes form 0 to n-1 with +1 increment.
            }
        }
    }
}
