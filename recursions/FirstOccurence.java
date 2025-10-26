public class FirstOccurence {
    public static int firstOccurenceInArray(int arr[],int i,int key){
        
        if (i==arr.length) {
            return -1;
        }
        
        
        if (arr[i]==key) {
            return i;
        }

        return firstOccurenceInArray(arr, i+1, key);
    }


    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(firstOccurenceInArray(arr, 0, 6));
    }
}
