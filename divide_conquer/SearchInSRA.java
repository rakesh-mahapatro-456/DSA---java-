public class SearchInSRA {
    public static int searchInRotatedSortedArray(int arr[],int key,int si,int ei){

        if (si>ei) {
            return -1;
        }

        int mid = si+(ei-si)/2;
        
        // mid will be checked here
        if (arr[mid]==key) {
            return mid;
        }

        //mid on l1
        if (arr[si]<= arr[mid]) {
            //case a: left of l1
            if (arr[si]<=key && key <= arr[mid]) {
                return searchInRotatedSortedArray(arr, key, si, mid-1);
            }
            //case b : left of l2
            else{ 
                return searchInRotatedSortedArray(arr, key, mid+1, ei);
            }
        }
        // mid on l2
        else{
            //case a: right of l2
            if (arr[mid]<=key && key <= arr[ei]) {
                return searchInRotatedSortedArray(arr, key, mid+1,ei);
            }
            //case b : left of l2
            else{ 
                return searchInRotatedSortedArray(arr, key, si,mid-1);
            }
        }


    }


    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchInRotatedSortedArray(arr,target,0,arr.length-1));
    }
}
