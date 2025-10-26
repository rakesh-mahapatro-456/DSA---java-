import java.util.HashMap;
import java.util.Set;

public class Duplicates {

    public static void  duplicateCharacters(String s){
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                int val = hm.get(ch);
                val++;
                hm.put(ch, val);
            }
            else{
                hm.put(ch, 1);
            }
        }

        Set<Character> keys = hm.keySet();

        for (Character k : keys) {
            if(hm.get(k) > 1){
                System.out.println(k + " -> " + hm.get(k));
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
            "geeksforgeeks",
            "programming",
            "hello world",
            "aabbccdd",
            "abc"
        };

        for (String test : testStrings) {
            System.out.println("Input: " + test);
            duplicateCharacters(test);
            System.out.println();
        }
    }
}