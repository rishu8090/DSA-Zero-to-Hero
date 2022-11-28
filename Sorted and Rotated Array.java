   public class App {
    public static int Search(int arr[] , int target , int si , int ei){
       // Base Case : if target not found.
       if(si > ei){
        return -1;
       }
       
        // work
        int mid = si + (ei-si)/2;
        // case found
        if(arr[mid] == target){
            return mid;
        }
        // if target is at line 1.
        if(arr[si] <= arr[mid]){
            // case a: left from the mid .
            if(arr[si] <= target && target <= arr[mid]){
                return Search(arr,target, si , mid -1);
            }else{
              //  case b: right from the mid.
                return Search(arr, target, mid+1, ei);
            }

            // if target is at line 2.
        }else{
           // case c: right from the mid on line 2.
            if(arr[mid+1] <= target && target <= arr[ei]){
                return Search(arr, target, mid+1, ei);          
            }else{
                // case d: left from the mid on line 2.
                return Search(arr, target, si, mid-1);
            }
        }
        }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {2,4,1,0,3,6,7};
        int target = 6;
        int si = 0;
        int ei = arr.length-1;
        System.out.print(Search(arr,target, si, ei));
    }
}
