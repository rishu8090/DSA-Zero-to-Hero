public class App {
    public static void printArr(int arr[]){
        for(int i= 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);   // piovt index.
        quickSort(arr, si, pIdx-1);  // for left part.
        quickSort(arr,pIdx+1,ei);  /// for right part.
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1; /// to make place for smaller els than pivot.
        
        for(int j =si; j <ei; j++){
            if(arr[j] <= pivot){
                i++;
                // swap.
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }  
        }
        i++;
        // swap.
        int temp = pivot;
        arr[ei] = arr[i]; // here, pivot =arr[i] is not used bcz
        arr[i] = temp;  //arr[ei] k through temp change karna h. na ki pivot k through arr[ei];
        return i;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
