import java.util.Scanner;

public class Basics4 {
    //parametrised recursion : we pass parameters and find values 
    public static void sumOfN(int n,int sum){
        if (n < 0) {
            System.out.println(sum);
            return;
        }

        sumOfN(n-1, sum+n);
    }

     //functional recursion : we break the problem into sub-prblm and call the fn f(n)+f(n-1)+........
    public static int sumOfN2(int n){
        if (n ==  0) {
            return 0;
        }

        return n+sumOfN2(n-1);
    }

     @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        sumOfN(n,sum);

        int sum2 = sumOfN2(n);
        System.out.println(sum2);
       
    }
}
