public class SumN {
    public static int sumNNaturalNos(int n){
        if (n==0) {
            return 0;
        }

        int ans = n+sumNNaturalNos(n-1);
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(sumNNaturalNos(1));
    }
}
