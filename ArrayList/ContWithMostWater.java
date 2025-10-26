import java.util.ArrayList;

public class ContWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater =0;

        // Brute-force : O(n^2)
        // for(int i=0;i<height.size();i++){
        //     for(int j=i+1;j<height.size();j++){
        //         int ht = Math.min(height.get(i),height.get(j));
        //         int wd = j-i;
        //         int currWater = ht*wd;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }

        // 2 - pointer approach : O(n)
        int lp = 0;
        int rp = height.size()-1;

        while (lp<rp) {
            //calculate water area
            int ht = Math.min(height.get(lp),height.get(rp));
            int wd = rp-lp;
            int currWater = ht*wd;
            maxWater = Math.max(maxWater, currWater);


            // updating lp,rp
            if (height.get(lp)<height.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height. add (8); 
        height. add (6) ; 
        height. add (2); 
        height. add (5); 
        height.add (4); 
        height. add (8); 
        height. add (3); 
        height. add (7);

        System.out.println(storeWater(height));
    }
}
