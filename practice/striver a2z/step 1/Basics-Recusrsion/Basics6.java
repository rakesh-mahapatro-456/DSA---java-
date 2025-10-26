public class Basics6 {
    public static void reverse(int arr[],int lp,int rp){
        int temp = arr[lp];
        arr[lp] = arr[rp];
        arr[rp] = temp;
    }

    public static void reverseArr(int arr[],int lp,int rp){
        if(lp>=rp){
            return;
        }

        reverse(arr, lp, rp);
        reverseArr(arr, lp+1, rp-1);
    }

    public static void reverseArr2(int arr[],int l){
        if(l>=arr.length/2){
            return;
        }

        reverse(arr, l, arr.length-l-1);
        reverseArr2(arr,l+1);
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        // reverse(arr, 0, arr.length-1);

        // printArr(arr);

        reverseArr2(arr, 0);
        printArr(arr);
    }
}
