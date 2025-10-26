public class IncreasingPrint {
    public static void increasing_Print(int n){
        if (n == 0) {
            return ;
        }
        increasing_Print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        increasing_Print(5);
    }
}
