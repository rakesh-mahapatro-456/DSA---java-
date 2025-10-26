public class LargestElement{
    public static void findLargest(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,54,1,2};
        findLargest(arr);
    }
}