import java.util.Arrays;
import java.util.Comparator;

public class Chocola {
    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer costVer [] = {2,1,3,1,4}; //m-1
        Integer costHor [] = {4,1,2}; //n-1|

        Arrays.sort(costHor,Comparator.reverseOrder());
        Arrays.sort(costVer,Comparator.reverseOrder());

        int h = 0 , v =0 ;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h<costHor.length && v < costVer.length) {
            if (costHor[h]<= costVer[v]) { //vertical curt
                cost += (costVer[v]*hp);
                vp++;
                v++;
            }
            else{
                cost += (costHor[h]*vp); //horizontal cut
                hp++;
                h++;
            }
        }


        while (h<costHor.length) {
            cost += (costHor[h]*vp); //horizontal cut
            hp++;
            h++;
        }


        while (v < costVer.length) {
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }



        System.out.println(cost);
        
    }
}
