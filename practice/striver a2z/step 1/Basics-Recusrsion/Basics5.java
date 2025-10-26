import java.util.Scanner;

public class Basics5 {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n*factorial(n-1);
    }

     public static void factorial2(int n,int prod){
        if(n == 0){
            System.out.println(prod);
            return ;
        }

        factorial2(n-1,prod*n);
    }


      @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = factorial(n);

        System.out.println(fact);

        int prod = 1;
        factorial2(n, prod);
       
    }
}
