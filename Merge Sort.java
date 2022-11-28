public class App {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si +(ei -si)/2;
        mergeSort(arr, si, mid);  // for left part.
        mergeSort(arr,mid+1,ei);  // for right part.
        merge(arr, si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;  // iterator for left part.
        int j = mid+1;  // iterator for right part.
        int k = 0;   // iterator for temp array.
        while(i <= mid && j <= ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++ ; k++;
            }else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        // for remaining elements in left part.
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // for remaining elements in right part.
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        // for copy temp array to original array.
        for( i = si , k = 0; k< temp.length; i++ , k++){
            arr[i] =temp[k];
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
