
public class Pattern {

    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // int  n =4;
        //  for(int i=1;i<=4;i++){
        //     for(int j=1;j<=(n-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // for (int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // char ch = 'A';
        // for (int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=(n-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // int count = 1;
        // for(int i = 1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(count);
        //         count++;
        //     }
        //     System.out.println();
        // }

        // for(int i = 1;i<=n;i++){

        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // for (int i = n; i >=1; i--) {
        //     // Print spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
       
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j == i || j == n - i + 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if ( j==1||j==n|| i == n|| i ==1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // for(int i =0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         if ((i+j)%2==0) {
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i =5;i >=1;i--){
        //     for(int j=5;j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //       System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<i;j++){
        //       System.out.print(" ");
        //     }

        //     for(int j=5;j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //       System.out.print(" ");
        //     }

        //     for(int j=1;j<=((2*i)-1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=(n-i);j++){
        //       System.out.print(" ");
        //     }

        //     for(int j=1;j<=((2*i)-1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Print stars for hollow pattern
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        
    }
    
}
