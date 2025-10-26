public class SecondLargestElement {
    public static void findSecondLargest(int arr[]) {
        int largest = arr[0];
        int sLargest = -1;

        int smallest = arr[0];
        int sSmallest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest && arr[i] != largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest && arr[i] != smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }

        System.out.println(sLargest);
        System.out.println(sSmallest);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 54, 1, 2 };
        findSecondLargest(arr);
    }
}
