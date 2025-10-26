public class TowerOfHanoi {
    public static void hanoi(int n,int A,int C,int B){
        if (n==0) {
            return;
        }
        hanoi(n-1, A, B, C);
        System.out.println("Move " + n + " disk from "+A+" to "+C );
        hanoi(n-1, B, C, A);
    }


    public static void main(String[] args) {
        hanoi(3, 10, 30, 20);
    }
}
