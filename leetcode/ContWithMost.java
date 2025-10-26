public class ContWithMost {

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};

        int lh[] = new int[height.length];
        int rh[] = new int[height.length];

        lh[0] = 0;
        for(int i=1;i<lh.length;i++){
            lh[i] = Math.max(lh[i-1],height[i-1]);
        }

        rh[rh.length-1] = 0;
        for(int i=rh.length-2;i>=0;i--){
            rh[i] = Math.max(rh[i+1],height[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            //(waterlevel-htl)*width
            int waterLevel =  Math.min(lh[i], rh[i]);
            trappedWater += waterLevel-height[i];

        }


        System.out.println(trappedWater);
    }
}