import java.util.*;

public class MajElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int nums = arr[i];
            // if (hm.containsKey(nums)) {
            //     hm.put(nums, hm.get(nums)+1);
            // }
            // else{
            //     hm.put(nums, 1);
            // }

            hm.put(nums, hm.getOrDefault(nums, 0)+1);
        }

        Set<Integer> keys = hm.keySet();
        
        for(Integer k : keys){
            if (hm.get(k) > arr.length/3 ) {
                System.out.println(k);
            }
        }
    }
}
