public class LinearSearch {
    public static int ls(int[] n, int k) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == k) {
                return i; 
            }
        }
        return -1; 
    }
    public static int ls(String[] n, String k) {
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals(k)) { 
                return i; 
            }
        }
        return -1; 
    }

    public static int ls(int n[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (n[i]>largest) { 
                largest = n[i]; 
            }
        }
        return largest;
    }


    public static int binarySearch(int n[], int k){
        int start = 0;
        int end  = n.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (n[mid]==k) {
                return mid;
            }
           
            if (n[mid]>k) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return -1;
    }

    public static void reverseArray(int n[]){
        int start = 0;
        int end = n.length-1;
        while(start<end){
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;

            start++;
            end--;
        }
    }


    public static void pairs(int n[]){
        for(int i=0;i<n.length;i++){
            int curr = n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+curr+","+n[j]+")");
            }
            System.out.println();
        }
    }

    public static void subArrays(int n[]){
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(n[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void MaxMinSubArray(int n[]){
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < n.length; i++) {
            int sum = 0; 
            for (int j = i; j < n.length; j++) {
                sum += n[j];
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays: " + max);
        System.out.println("Minimum sum of subarrays: " + min);
    
    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        // String[] a = {"a", "b", "c", "d"};

        // System.out.println(ls(arr, 5)); 
        // System.out.println(ls(a, "a")); 
        // System.out.println(ls(arr)); 
        // System.out.println(binarySearch(arr, 6));

        // reverseArray(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        // System.out.println();

        pairs(arr);
        subArrays(arr);
        MaxMinSubArray(arr);

    }
}
