public class selectionSort {
    public static void selection_sort(int arr[]){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int currMin = i;
            for(int j=i+1;j<n;j++){
                if (arr[currMin]<arr[j]) {
                    currMin = j;
                }
            }
            int temp = arr[currMin];
            arr[currMin] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.err.print(n[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr [] = {3,1,4,5,9};
        selection_sort(arr);
        print(arr);
    }
}
