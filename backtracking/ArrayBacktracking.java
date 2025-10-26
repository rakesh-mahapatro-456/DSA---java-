public class ArrayBacktracking {

    public static void arrayBacktrack(int arr[],int i){
        if (i==arr.length) { // base case
            return;
        }

        arr[i] = i+1;
        arrayBacktrack(arr, i+1); // recursion - fnx call step
        arr[i] = arr[i]-2; //backtracking - always it will be after functions call step.while returning from recursion and performing some task is known as backtracking


        // time-complexity : O(n)
        // space-complexity : O(n)


    }

    public static void  printArry(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        arrayBacktrack(arr, 0);
        printArry(arr);

    }
}