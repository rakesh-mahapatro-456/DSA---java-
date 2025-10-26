public class GridWays {
    //time-complexity:O(2^m+n) => exponenetial time complexity very bad :(
    public static int grid_ways(int i,int j,int n,int m){
        //base case
        if (i==n-1&&j==m-1) {
            //condition for last cell
            return 1;
        }
        else if (i==n||j==m) {
            //condition when i or j crosses boundary
            return 0;
        }
        //recursion
        //way 1
        int w1 = grid_ways(i+1, j, n, m);

        //way 2
        int w2 = grid_ways(i, j+1, n, m);

        return w1+w2;

    }
    public static void main(String[] args) {
        int n=3,m=3;// n--> rows,m--> cols ,i-->cuur row,j-->curr col
        System.out.println(grid_ways(0, 0, n, m));

    }
}
