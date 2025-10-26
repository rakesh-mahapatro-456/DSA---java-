public class Advance {
    public static void main(String[] args) {
        int n =4;
        int c = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=c;j++){
                if(i==1||j==1|i==n||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=((n-i)+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }

        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 2 * n - 1; i++) {
            int currentRow = i <= n ? i : 2 * n - i; // Determine the current row based on the loop iteration
            
            // Print leading spaces
            for (int j = currentRow; j < n; j++) {
                System.out.print(" ");
            }
            
            // Print stars for hollow pattern
            for (int j = 1; j <= 2 * currentRow - 1; j++) {
                if (j == 1 || j == 2 * currentRow - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        
    
    
    }
}
