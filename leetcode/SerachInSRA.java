// import java.util.Arrays;

public class SerachInSRA {

    public static void main(String[] args) {
        int A[] = {3 ,1 ,2 ,5 ,3};
        // Arrays.sort(A);
        // int a = 0;
        // int b = 0;
        // int idx = 0;
        
        // for(int i=0;i<A.length-1;i++){
        //     int nums = A[i];
        //     if(nums == A[i+1]){
        //         a = nums;
        //         idx = i;
        //     }
        // }

        // A[0] = A[0];
        // for(int i = 0, j = A[1]; i < A.length && j <= A[A.length - 1]; i++, j++) {
        //     A[i] = j;
        // }


        // b = A[idx];
        int n = A.length;
        
        // Expected sums
        long S_n = (long) n * (n + 1) / 2;
        long S2_n = (long) n * (n + 1) * (2 * n + 1) / 6;
        
        // Actual sums
        long S = 0, S2 = 0;
        
        for (int num : A) {
            S += num;
            S2 += (long) num * num;
        }
        
        // Missing - Repeated
        long diff = S_n - S; // M - R
        long sumDiff = S2_n - S2; // M^2 - R^2
        
        // Using (M^2 - R^2) = (M - R) * (M + R)
        long sum = sumDiff / diff; // M + R
        
        // Solving for M and R
        int missing = (int) ((sum + diff) / 2);
        int repeated = (int) ((sum - diff) / 2);
        
        
        System.out.println("a =" +missing + "b = "+repeated );
        
    }
}



