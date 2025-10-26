import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyNum {
        // You are given an integer array list nums.
        // A number x is lonely when:

        // It appears only once in the array list.
        // No adjacent numbers (i.e., x + 1 and x - 1) appear in the array list.
        // Return all lonely numbers in nums. You may return the answer in any order.

        // Sample Input 1:
        // nums = [10, 6, 5, 8]

        // Sample Output 1:
        // [10, 8]

        // Explanation:
        // 10 is a lonely number since it appears exactly once and 9 and 11 do not appear in nums.
        // 8 is a lonely number since it appears exactly once and 7 and 9 do not appear in nums.

        // we will use hashmap data structure it will help in checking if an element is there in array list in constant time

        public static List<Integer> findLonely( ArrayList<Integer> al){
            HashMap <Integer,Integer> map = new HashMap<>();

            int n = al.size();

            for (int i = 0; i < n; i++) {
                int key = al.get(i); // Get the current element from the ArrayList
                if (!map.containsKey(key)) {
                    map.put(key, 1); // Initialize the count for a new element
                } else {
                    map.put(key, map.get(key) + 1); // Increment the count for an existing element
                }
            }



            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n - 1; i++) { // Avoid out-of-bounds
                int current = al.get(i);
                if (map.containsKey(current - 1) && map.containsKey(al.get(i + 1)) && map.get(current) == 1) {
                    ans.add(current);
                }
            }

            return ans;
            
        }



        public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<>();
            al. add (8); 
            al. add (6) ; 
            al. add (2); 
            al. add (5); 
            al.add (4); 
            al. add (8); 
            al. add (3); 
            al. add (7);
            
            // HashMap <Integer,Integer> map = new HashMap<>();

            // in lonely num we use hash map to store numbers and there frequency of there ocuuring
            // map.put(7, 10);
            // map.put(3, 5);
            // map.put(9, 11);

            // map[key] = value
            // map[element] = frequency
            // to check whether a key is there in hasmap we use .containskey() method


            // System.out.println(map.containsKey(7));

            // //size of hash map
            // System.out.println(map.size());

            // now we check the ip array or arraylist if an element is not there in hashmap then we add it to hasmap and set its frequency to 1
            //if(map.containsKey(arr[i]) == false){
            //  map.put(arr[i],1);
            //} 
            // if elemnt is already there in the hashmap then we update its frequency with 1
            // else{
            //    map.put(arr[i],map.get(arr[i])+1);
            //}

            System.out.println(findLonely(al));

        }
}



// public List<Integer> findLonely(int[] nums) {
//     Arrays.sort(nums);
//     List<Integer> ans = new ArrayList<>();

//     for (int i = 0; i < nums.length; i++) {
//         int prev = (i > 0) ? nums[i - 1] : Integer.MIN_VALUE;
//         int nxt = (i < nums.length - 1) ? nums[i + 1] : Integer.MAX_VALUE;

//         boolean isLonely = true;

//         if (prev == nums[i] - 1 || nxt == nums[i] + 1 || prev == nums[i] || nxt == nums[i]) {
//             isLonely = false;
//         }

//         if (isLonely) {
//             ans.add(nums[i]);
//         }
//     }

//     return ans;

// }