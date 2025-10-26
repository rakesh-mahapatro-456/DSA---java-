public class Strings {

    public static boolean isPalindrome(String str){
        boolean flag = false;
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i)== str.charAt(str.length()-i-1)) {
                flag  = true;
            }
            else{
                flag = false;
            }
        }

        return flag;
    }

     public static void main(String[] args) {
        // char str[] = {'a','b','c'};

        // //strings are immutable
        // String str2 = "abcd";
        // String str3 = new String("abcde");

        // String str = "naman";
        String str = "abacd";
        System.out.println(isPalindrome(str));
     }
}