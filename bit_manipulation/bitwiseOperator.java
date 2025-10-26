public class bitwiseOperator {
     public static void getIth(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }

    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return  n | bitMask ;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = 1<<i;
        return  n & ~(bitMask) ;
    }

    public static int updateIthBit(int n,int i,int newBit){
        // if (newBit == 0){
        //     clearIthBit(n, i);
        // }
        // else{
        //     setIthBit(n,i);
        // }

        n = clearIthBit(n,i);
        int newBitMask = newBit << i;
        return n |  newBitMask ;
    }



    public static void main(String[] args) {
        getIth(15, 2);
        System.out.println( setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));

       
    }
}
