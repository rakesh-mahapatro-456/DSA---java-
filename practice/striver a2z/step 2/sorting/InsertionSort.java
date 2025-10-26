public class InsertionSort {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                //swap
                swap(arr, j-1, j);
                j--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {3,5,1,6,7};
        insertionSort(arr);
        printArr(arr);
    }
}
