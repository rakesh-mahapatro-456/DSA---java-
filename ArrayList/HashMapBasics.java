import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map = new HashMap<>();

        // in lonely num we use hash map to store numbers and there frequency of there ocuuring
        map.put(7, 10);
        map.put(3, 5);
        map.put(9, 11);

        // map[key] = value
        // map[element] = frequency
        // to check whether a key is there in hasmap we use .containskey() method


        System.out.println(map.containsKey(7));

        //size of hash map
        System.out.println(map.size());

    }
}
