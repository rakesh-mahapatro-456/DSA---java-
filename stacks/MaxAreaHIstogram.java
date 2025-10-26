import java.util.*;;
public class MaxAreaHIstogram {

    public static void maxArea(int ht[]){
        int maxArea = 0;
        int nsr[] = new int[ht.length];
        int nsl[] = new int[ht.length];

        //calculate nsr
        Stack<Integer> s =new Stack<>();
        for(int i = ht.length-1;i>=0;i--){
            while (!s.isEmpty() && ht[s.peek()]>= ht[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = ht.length;
            }
            else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }

       
        //calculate nsl
         s =new Stack<>();

        for(int i = 0;i<ht.length;i++){
            while (!s.isEmpty() && ht[s.peek()]>= ht[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }


        //calculate area
        for(int i=0;i<ht.length;i++){
            int height = ht[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height*width;

            maxArea = Math.max(maxArea, currArea);
        }


        System.out.println("max area is :" +maxArea);
    }


    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        maxArea(height);
    }
}
