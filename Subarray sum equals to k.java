import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum , count);
        map.put(0,1);// this condition works when we have a single element in the array,
                              //  and we searching that particular element as sum OR if whole arr sum equals to k.
        int sum =0;
        int ans = 0;

        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
            // if(map.containsKey(sum)){
            //     map.put(sum , ans+1);
            // }else{
            //         map.put(sum,0 );
            // }
        }
        System.out.println( " No. of subArrays sum equals to k: "+ans);
    }
}
