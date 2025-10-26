public class trappingRainWater {
    public static int trapping_rain_water(int n[],int width){
        int lmb[] = new int[n.length];
        int rmb[] = new int[n.length];
        
        lmb[0] = n[0];
        rmb[n.length-1] = n[n.length-1];

        for(int i=1;i<n.length;i++){
            lmb[i] = Math.max(lmb[i-1], n[i]);
        }

        for(int i=n.length-2;i>=0;i--){
            rmb[i] = Math.max(rmb[i+1], n[i]);
        }


        int wl = 0;
        int tw = 0;

        for(int i=0;i<n.length;i++){
            wl = Math.min(lmb[i], rmb[i]);
            tw += (wl-n[i])*width;
        }

        return tw;
    }


    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trapping_rain_water(arr, 1));

    }
}
