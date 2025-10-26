import java.util.*;
public class Basics1 {
    public static void printName(int n,String str,int count){
        if(count >= n){
            return;
        }

        System.out.println(str);

        printName(n, str,count+1);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        printName(n, s,0);
        
    }
}

// tc :O(n) & sc :O(n)