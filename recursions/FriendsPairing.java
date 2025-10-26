public class FriendsPairing {
    public static int waysFriendsPairing(int n){
        if (n==1||n==2) {
            return n;
        }
        return waysFriendsPairing(n-1)+(n-1)*waysFriendsPairing(n-2);
    }


    public static void main(String[] args) {
        System.out.println(waysFriendsPairing(3));
    }
}
