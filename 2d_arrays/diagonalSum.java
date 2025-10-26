public class diagonalSum {
    public static void sumOfDiagonal(int[][] arr) {
        int sum = 0;
        int n = arr.length;

        // Optimized O(n) approach
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += arr[i][i];
            
            // Add secondary diagonal element if it's not the same as primary diagonal element
            if (i != n - 1 - i) {
                sum += arr[i][n - 1 - i];
            }
        }

        System.out.println("Sum of diagonals: " + sum);
    }

    public static void main(String[] args) {
        int[][] num = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        sumOfDiagonal(num);
    }
    
}
