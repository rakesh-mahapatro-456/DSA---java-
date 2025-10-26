import java.util.ArrayList;

public class Rearrange {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int ans[] = new int[n];

        int posV = 0;
        int negV = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        if (pos.size() >= neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                ans[posV] = pos.get(i);
                posV += 2;

                ans[negV] = neg.get(i);
                negV += 2;
            }

            int idx = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                ans[idx++] = pos.get(i);
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                ans[posV] = pos.get(i);
                posV += 2;

                ans[negV] = neg.get(i);
                negV += 2;
            }

            int idx = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                ans[idx++] = neg.get(i);
            }
        }

        return ans;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, -1, -3, -4 };

        int ans[] = rearrangeArray(arr);
        printArr(ans);

    }
}
