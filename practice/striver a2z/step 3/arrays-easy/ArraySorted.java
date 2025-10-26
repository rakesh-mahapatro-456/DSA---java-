public class ArraySorted {
    public static boolean isSorted(int arr[]){
         for(int i=0;i<arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[] = {4,5,2,9,1};

        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr));
    }
}
