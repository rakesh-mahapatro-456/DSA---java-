public class countingSort {
    public static void counting_Sort(int arr[]) {
        int n = arr.length;

        // Step 1: Find the maximum value in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create and populate the count array
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 3: Reconstruct the sorted array
        int j = 0;
        for (int i = max; i >=0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Helper method to print the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 5, 9};
        counting_Sort(arr);
        print(arr);
    }
}
