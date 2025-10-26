import java.util.Stack;
public class ReverseString {
    public static String reverseString(String str){
        int i = 0;
        Stack<Character> s = new Stack<>();
        while (i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder cstr = new StringBuilder("");

        while (!s.isEmpty()) {
            cstr.append(s.pop());
        }

        return cstr.toString();

    }

    public static void main(String[] args) {
        String s = new String("abc");

        System.out.println(reverseString(s));
    }
}
