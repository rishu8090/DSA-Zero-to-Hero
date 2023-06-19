import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {15,-2,2,-8,1,7,10};
        HashMap<Integer , Integer> map = new HashMap<>();
        // (sum , idx);

        int sum = 0;
        int len = 0;

        for(int j = 0; j <  arr.length ; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len ,j- map.get(sum));
            }else{                          // j-i = j- map.get(sum)
                map.put(sum , j);   
            }
        }

        System.out.println("Max. length of Subarray of sum 0 -> " + len);
    }
}
