public class LeftRotate {
    public static void leftRotateByOne(int arr[]){
        int temp = arr[0];

        for(int i=0;i<=arr.length-2;i++){
            arr[i] = arr[i+1]; //idx out of bound arr[4] = arr[5]
        }

        arr[arr.length-1] = temp;

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5};
        leftRotateByOne(arr);
        printArr(arr);
    }
}
