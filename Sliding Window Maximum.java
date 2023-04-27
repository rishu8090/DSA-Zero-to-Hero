import java.util.*;
public class App {
    static class Pair implements Comparable<Pair> {
        int val;
        int index;

        public Pair(int val, int index){
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo( Pair p2){
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int result[] = new int[arr.length -k +1]; // n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        // 1st Window.
        for(int i = 0; i < k; i++){
            pq.add(new Pair(arr[i] , i));
        }

        result[0] = pq.peek().val;

        // for remaining windows.
        for(int i = k; i < arr.length; i++){
            while(pq.size() > 0 && pq.peek().index <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i] , i));
            result[i-k+1] = pq.peek().val;
        }

        // for Printing result.
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
