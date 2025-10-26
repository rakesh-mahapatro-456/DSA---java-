import java.util.Scanner;

public class Basics3 {
     public static void printFromN(int n,int count){
        if(count < 1){
            return;
        }

        System.out.println(count);
        printFromN(n, count-1);
    }

     @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFromN(n,n);
    }
}

// tc :O(n) & sc :O(n)