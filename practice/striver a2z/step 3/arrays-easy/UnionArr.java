import java.util.ArrayList;

public class UnionArr {
    public static int[] unionOfArr(int arr1[], int arr2[]) {
        ArrayList<Integer> union = new ArrayList<>();

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } 
            else { // arr1[i] == arr2[j] equality case 
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        int[] arr = new int[union.size()];
        for (int k = 0; k < union.size(); k++) {
            arr[k] = union.get(k);
        }
        return arr;
    }

    public static void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 3, 4, 5};
        int arr2[] = {2, 3, 4, 5, 6, 7};

        int union[] = unionOfArr(arr1, arr2);
        printArr(union);
    }
}
