public class LastOccurence {
    public static int lastOccurenceInArray(int arr[],int i,int key){
        
        if (i==arr.length) {
            return -1;
        }
        int isFound = lastOccurenceInArray(arr, i+1, key);
        if (isFound != -1) {
            return isFound;
        }

        if (arr[i]==key) {
            return i;
        }
        
        return isFound;
    }


    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,5,8,5};
        System.out.println(lastOccurenceInArray(arr, 0, 5));
    }
}
