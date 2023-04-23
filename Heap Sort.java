public class App {

    public static void heapify(int arr[], int i, int size ){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }
        if(right < size && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }
        if(maxIdx != i){
            // swap 
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size );
        }
    }

    public static void heapSort(int arr[] ){  // T.C -> O(n*logn)
        // Step 1: Build maxHeap.
        int n = arr.length -1;
        for(int i = n/2 ; i >= 0 ; i--){
            heapify(arr, i, n);
        }

        // Step 2: push largest at the end.
        for(int i = n-1 ; i > 0 ; i--){
            // Swap -> largest at end ( first with last).
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {1,2,4,3,5};
        heapSort(arr);

        for(int i = 0; i <= arr.length -1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}