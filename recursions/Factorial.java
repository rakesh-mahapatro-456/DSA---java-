public class Factorial {
    public static int factorialNumber(int n){
        if (n==0) {
            return 1;
        }

        int ans = n* factorialNumber(n-1);

        return ans;
    }


    public static void main(String[] args) {
        
        System.out.println(factorialNumber(5));
    }



}
