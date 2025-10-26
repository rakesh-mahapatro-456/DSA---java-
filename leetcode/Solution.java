import java.util.*;
public class Solution {
    public static ArrayList<Integer> findDuplicates(Integer[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(Integer i : hm.keySet()){
            if (hm.get(i) > 1) {
                al.add(i);
            }
        }

        return al;

    }

    public static int minCost(int[] arr) {
        Arrays.sort(arr);
        int median = arr[arr.length/2];

        int cost =0;
        for(int i=0;i<arr.length;i++){
            cost += Math.abs(arr[i] - median); 
        }

        return cost;
    }

    public static void reverseSubarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    

    public static boolean checkReverse(int arr[], int n) { 
        int start = 0;
        int end = 0;

        for(int i=start ;i<n-1;i++){
            if (arr[i] > arr[i + 1]) {
                end = i;
                break;  
            }
        }

        if (start == 0) {
            return true;
        }

        for (int i = start; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                end = i;
                break;
            }
        }
    
        if (end == 0){
            end = n - 1;
        }

        reverseSubarray(arr, start, end);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return  false; 
            }
        }

        return true;

    }


    public static void main(String[] args) {
        // Integer[] arr = { 1, 6, 5, 2, 3, 3, 2 };
        // ArrayList<Integer> duplicates = findDuplicates(arr);

        // for (int element : duplicates) {
        //     System.out.print(element + " ");
        // }

        // int[] arr = {1, 100, 101};
        // System.out.println(minCost(arr));

        int arr[] = {1, 3, 4, 10, 9, 8}; 
        int n = arr.length; 
  
        if (checkReverse(arr, n)) { 
            System.out.print("Yes"); 
        } else { 
            System.out.print("No"); 
        } 
    }
}
