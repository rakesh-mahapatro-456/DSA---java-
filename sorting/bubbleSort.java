public class bubbleSort {
    public static void bubble_sort(int arr[]){
        int n = arr.length;
        boolean flag  = false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j]< arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag!=true) {
                System.out.println("sorted array given");
                break;
            }
        }
    }


    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.err.print(n[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr [] = {3,1,4,5,9};
        // int ar[] = {9,8,7,6,5};
        // bubble_sort(ar);
        bubble_sort(arr);
        print(arr);
    }
}
