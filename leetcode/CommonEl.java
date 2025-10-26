import java.util.HashMap;
import java.util.HashSet;

public class CommonEl {

    public static int findCommon(int mat[][]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            HashSet<Integer> seen = new HashSet<>();

            for (int j = 0; j < cols; j++) {
                // Avoid duplicate additions from the same row
                if (!seen.contains(mat[i][j])) {
                    hm.put(mat[i][j], hm.getOrDefault(mat[i][j], 0) + 1);
                    seen.add(mat[i][j]);
                }
            }
        }

        // Find any element that appears in all rows
        for (int key : hm.keySet()) {
            if (hm.get(key) == rows) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int mat[][] = {
            { 1, 2, 3, 4, 5 },
            { 2, 4, 5, 8, 10 },
            { 3, 5, 7, 9, 11 },
            { 1, 3, 5, 7, 9 }
        };

        int result = findCommon(mat);
        if (result == -1) {
            System.out.println("No common element");
        } else {
            System.out.println("Common element is " + result);
        }
    }
}
