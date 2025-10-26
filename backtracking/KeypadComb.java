public class KeypadComb {
    public static String stringCombinations(String str, int i, String currentCombination) {
        // If all digits are processed, return the current combination
        if (i == str.length()) {
            return currentCombination + " ";
        }

        // Define the mapping for keypad numbers to letters
        String keys[] =  { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // Get the current digit from the string and find its corresponding letters
        int digit = str.charAt(i) - '0'; // Convert character to integer
        String possibleChars = keys[digit]; // Get corresponding characters for the current digit
        
        StringBuilder result = new StringBuilder();

        // Recursively build combinations by adding each character from the current digit's possible characters
        for (int j = 0; j < possibleChars.length(); j++) {
            result.append(stringCombinations(str, i + 1, currentCombination + possibleChars.charAt(j)));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "234";
        String combinations = stringCombinations(str, 0, "");
        System.out.println("Combinations: " + combinations);
    }
}



// class Solution 
// {
//     static void rec(int i, String digits,String mp[], String res, List<String>ans)
//     {
//          if(i==digits.length())
//          {
//              ans.add(res);
//              return;
//          }
        
//          char ch= digits.charAt(i);
//          int num = ch-'0';
        
//          String st= mp[num];
         
//          for(int j=0;j<st.length();j++)
//          {
//               rec(i+1,digits,mp, res+ st.charAt(j), ans);
//          }
//     }
//     public List<String> letterCombinations(String digits)
//     {
//         List<String>ans= new ArrayList<>();
        
//         if(digits.length()==0)
//              return ans; 
        
//         String mp[]={"", "", "abc", "def","ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        
//         rec(0,digits,mp,"",ans);
        
//         return ans;
//     }
// }
