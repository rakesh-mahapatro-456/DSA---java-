public class arraysProduct {

   
    public static int[] arraysProductExceptSelf(int arr[]){

         // Brute force
            int n = arr.length ;
            int res [] = new int[n];
            //int product  = 1 ;
    
            // for(int i=0;i<arr.length;i++){
            //     product =1;
            //     for(int j=0;j<arr.length;j++){
            //         if(j!=i){
            //             product = product*arr[j];
            //         }
            //     }
            //     res[i] = product;
            // }

        // Prefix suffix of array

            // int prefix[] = new int[n];
            // prefix[0] = arr[0];
            // for(int i=1;i<arr.length;i++){
            //     prefix[i] = prefix[i-1]*arr[i];
            // }

            // int suffix[] = new int[n];
            // suffix[n-1] = arr[n-1];
            // for(int i=n-2;i>=1;i--){
            //     suffix[i] = suffix[i+1]*arr[i];
            // }

            // res[0] = suffix[1];
            // res[n-1] = prefix[n-2];

            // for(int i=1;i<n-1;i++){
            //     res[i] = prefix[i-1]*suffix[i+1];
            // }

            //optimized way 
             
            
 
            for(int j=0;j<res.length;j++){
                System.out.print(res[j]+" ");
            }
            return res;
       }
    
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            arraysProductExceptSelf(arr);
            
    }
}
