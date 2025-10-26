public class LinearSearch {
    public static void linearSearch(int arr[],int target){
        boolean isFound = false;
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target) {
               isFound = true;
               idx = i;
               break;
            }
        }

        if (isFound) {
            System.out.println("found at idx : "+idx);
        }
        else{
            System.out.println("didnt find it ");
        }
    }
    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 4;

        linearSearch(arr,target);
    }
}
