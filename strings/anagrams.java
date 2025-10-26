import java.util.Arrays;

public class anagrams {
    public static void isAnagrams(String str1,String str2){
        if(str1.length() != str2.length()){
            System.out.println("not a anagram has lengths are different");
        }
        else{
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char [] ch1 = str1.toCharArray();
            char [] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.println("is a anagram");
            }
            else{
                System.out.println("not a anagaram");
            }
        }
    }


    public static void main(String[] args) {
        isAnagrams("Race", "Cares");
    }
}
