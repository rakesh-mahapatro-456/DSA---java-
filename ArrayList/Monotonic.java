import java.util.ArrayList;

public class Monotonic {
    // An ArrayList is monotonic if it is either monotone increasing or monotone decreasing. An ArrayList nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An ArrayList nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j). Given an integer ArrayList nums, return true if the given list is monotonic, or false otherwise.
    
    public static boolean isMonotonic(ArrayList<Integer> list) {
        if (list.size() <= 1) return true; // A single element or empty list is monotonic by definition.

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                increasing = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                decreasing = false;
            }
        }
        

        return increasing || decreasing; // True if either increasing or decreasing remains true.
    }



    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height. add (8); 
        height. add (6) ; 
        height. add (2); 
        height. add (5); 
        height.add (4); 
        height. add (8); 
        height. add (3); 
        height. add (7);

        System.out.println(isMonotonic(height));
    }
}
