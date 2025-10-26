public class Basics7 {
    public static boolean isPalindrome(String str,int i){
        if (i>=str.length()/2) {
            return true;
        }

        if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
            return false;
        }

        return isPalindrome(str, i+1);
    }
    public static void main(String[] args) {
        String s = "madam";

       System.out.println(isPalindrome(s, 0));;

    }
}
