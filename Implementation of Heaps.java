import java.util.*;
public class App {
    static class Heap{
         ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //   Step 1 :Add at the Last idx.
            arr.add(data);

            int x = arr.size() -1;   //  x is the idx of child in AL.
            int par = (x-1)/2;      // par is the idx of parent idx by   (2i +1) .
 
            // Step 2 : Fix the heap. (min Heap).
            while(arr.get(x) < arr.get(par)){
                //swap.
                int temp = arr.get(x);
                arr.set(x , arr.get(par));
                arr.set(par , temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public  int peek(){
            return arr.get(0);
        }

        private void heapify(int i){        // T.C. -> O(log n)
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if( left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if( minIdx != i){
                // swap 
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){           //    T.C. -> O(log n)
            int data = arr.get(0);
            
            // Step 1 : To swap the first and last element.
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() -1));
            arr.set(arr.size() -1, temp);

            // Step 2 : delete last element.
            arr.remove(arr.size() -1);

            // Step 3 : Heapify (fix the Heap ).
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0; 
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        

        while(!h.isEmpty()){
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
