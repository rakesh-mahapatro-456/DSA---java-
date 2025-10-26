public class MergeSort {
    public static void merge_sort(int arr[],int si,int ei){
        if (si>= ei) {
            return;
        }

        int mid = si+(ei-si)/2;

        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);
        merge(arr, si, mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){

        int temp[] = new int[ei - si + 1];
        int i = si ; // left iterator
        int j = mid+1; // right iterator
        int k =0; // temp array iterator


        //compairing left and right sorted array parts and storing min element in the temp array and moving to next index in temp array
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        //for left over elements
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        // copying sorted array in original array
        for(k=0,i=si; k<temp.length;i++,k++){
            arr[i] = temp[k];
        }

    }


    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {2,7,1,4,5,0};
        merge_sort(arr, 0, arr.length-1);
        printArray(arr);
    }
}