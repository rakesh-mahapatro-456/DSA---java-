public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int arr[],int low,int high){
        if (low >= high) {
            return;
        }

        int pivot = partition(arr,low,high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }

    public static int partition(int arr[],int low,int high){
        int pivot = low;
        int i = low;
        int j = high;

        while (i<j) {
            while (arr[i]<= arr[pivot] && i<=high) {
                i++;
            }

            while (arr[j]> arr[pivot] && i>=low) {
                j--;
            }

            if (i<j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 7 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
