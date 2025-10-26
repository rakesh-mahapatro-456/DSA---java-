public class Quick_sort {
    public static void quickSort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }

        int pivot = partition(arr,si,ei,arr[ei]);
        quickSort(arr, si, pivot-1);
        quickSort(arr, pivot+1, ei);
    }


    public static int partition(int arr[],int si,int ei,int key){
        int i = si;
        for(int j=si;j<=ei;j++){
            if (arr[j] <= key) {
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
            }
        }

        return i-1;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[] = {2,7,1,4,5,0};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}



// public static void quick_sort(int arr[],int si,int ei){
//     //base case
//     if (si>=ei) {
//         return;
//     }

//     //last element
//     int pidx = partition(arr,si,ei);
//     quick_sort(arr, si, pidx-1); //left
//     quick_sort(arr, pidx+1, ei); //right

// }

// public static int partition(int arr[],int si,int ei){

//     int pivot = arr[ei];
//     int i = si-1; // making space for swapping elemnts smaller than pivot
    
//     for(int j=si;j<ei;j++){
//         if (arr[j]<= pivot) {
//             i++;
//             //swap
//             int temp = arr[j];
//             arr[j] = arr[i];
//             arr[i] = temp; 
//         }
//     }
//     //swapping pivot elemnt
//     i++;
//     //swap
//     int temp = pivot;
//     arr[ei] = arr[i];
//     arr[i] = temp; 
//     return i;

// }
