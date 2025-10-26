public class ArrayOccurence {
    public static void Array_Occurence(int arr[],int i,int key){
        if (i==arr.length) {
            return ;
        }

       if (arr[i]==key) {
           System.out.println(i);
       }

       Array_Occurence(arr,i+1,key);
    }


    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2 ;
        Array_Occurence(arr, 0, key);
    }
}
