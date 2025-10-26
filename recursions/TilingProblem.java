public class TilingProblem {
    public static int tilingWays(int n){
        if (n==0||n==1) {
            return 1;
        }

        int vertical = tilingWays(n-1);
        int horizontal = tilingWays(n-2);
        int total_ways = vertical+horizontal;


        return total_ways;
    }


    public static void main(String[] args) {
        System.out.println(tilingWays(5));
    }
}
