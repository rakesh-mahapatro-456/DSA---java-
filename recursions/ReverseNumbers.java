public class ReverseNumbers {
    public static void revrse_numbers(int n){
        // without recursion
        // for(int i =n;i>=1;i--){
        //     System.out.println(i);
        // }

        if (n == 0) {
            return ; // we are moving down in stack and removing unnecessary space
        }
        System.out.println(n);
        revrse_numbers(n-1);
        // keep small problem near to large problem


        // System.out.println(n);
        // revrse_numbers(n-1);
        // stack will overflow as we didnt keep any base case
    }





    public static void main(String[] args) {
        revrse_numbers(10);
    }
}