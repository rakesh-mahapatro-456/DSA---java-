import java.util.Scanner;

public class twoArrays {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int m = arr.length, n = arr[0].length;

        Scanner sc = new Scanner(System.in);

        // Input the elements of the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { // Corrected the loop condition
                arr[i][j] = sc.nextInt();
            }
        }

        // Output the elements of the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
