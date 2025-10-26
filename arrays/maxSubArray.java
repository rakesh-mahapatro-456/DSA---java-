public class maxSubArray {
    public static int max_Sub_Array(int n[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        //brute force
        // for(int i=0;i<n.length;i++){
        //     for(int j=i;j<n.length;j++){
        //         currSum = 0;
        //         for(int k = i;k<= j;k++){
        //             currSum += n[k];

        //         }
        //         if (currSum>maxSum) {
        //             maxSum = currSum;
        //         }
        //     }
        // }

        //prefix array
        // int prefix[] = new int[n.length];
        // prefix[0] = n[0];
        // for(int i=1;i<n.length;i++){
        //     prefix[i] = prefix[i-1]+n[i];
        // }

        // for(int i=0;i<n.length;i++){
        //     int start = i;
        //     currSum = 0;
        //     for(int j=i;j<n.length;j++){
        //         int end = j;
        //        if (start == 0) {
        //         currSum = prefix[end];
        //        }
        //        else{
        //         currSum = prefix[end]-prefix[start-1];
        //        }
        //         if (currSum>maxSum) {
        //             maxSum = currSum;
        //         }
        //     }
        // }

        //kadane's algorithm
        for(int i=0;i<n.length;i++){
            currSum += n[i];
            if(currSum<0){
                currSum = 0;
            }
            else if (currSum>maxSum) {
                maxSum = currSum;
            }
        }

        return maxSum;
    }



    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("max sub array is :"+max_Sub_Array(arr));
    }
}
