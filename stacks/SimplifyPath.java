import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String str){
        Stack<String> s = new Stack<>();
        String path[] = str.split("/");

        for(int i=0; i < path.length; i++){
            String curr = path[i];

            if (curr.equals("..")) {
                // pop operation 
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (!curr.equals("") && !curr.equals(".")) {
                // push operation
                s.push(curr);
            }
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.insert(0, "/" + s.pop());
        }

        if (sb.length() == 0) {
            return "/";
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = new String("/.../a/../b/c/../d/.");
        System.out.println(simplifyPath(str));
    }
}
