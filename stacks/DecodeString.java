import java.util.Stack;

public class DecodeString {
    
    public static String decodeStr(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if ( ch != ']') {
                s.push(ch);
            }
            else{
                StringBuilder sb = new StringBuilder();
               while (s.size()>0 && s.peek() != '[') {
                    sb.insert(0, s.pop());
                }
                
                String toRepeat = sb.toString();
                s.pop();


                sb = new StringBuilder();
                while (s.size()>0 && s.peek()>='0' && s.peek()<='9') {
                    sb.insert(0, s.pop());
                }

                int count = Integer.parseInt(sb.toString());

                while (count -->0) {
                    for(int j=0;j<toRepeat.length();j++){
                        char c = toRepeat.charAt(j);
                        s.push(c);
                    }

                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!s.isEmpty()) {
            ans.append(s.pop());
        }

        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = new String("2[cv]");
        
        System.out.println(decodeStr(str));


    }
}
