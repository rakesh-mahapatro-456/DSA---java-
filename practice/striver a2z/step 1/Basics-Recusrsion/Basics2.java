import java.util.Scanner;

public class Basics2 {
    public static void printTillN(int n,int count){
        if(count >= n){
            return;
        }

        System.out.println(count);
        printTillN(n, count+1);
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printTillN(n,0);
    }
}



// tc :O(n) & sc :O(n)