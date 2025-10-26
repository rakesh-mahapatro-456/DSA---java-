public class HeapSort {
    public static void heapSort(int arr[]) {
        int size = arr.length;

        // Step 1: Build Max Heap
        for (int i = size / 2 ; i >= 0; i--) {
            heapify(arr, size, i);
        }

        // Step 2: Swap the first and last element and heapify
        for (int i = size - 1; i > 0; i--) {
            // Swap first and last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int size, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, size, maxIdx);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};

        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
