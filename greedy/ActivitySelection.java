import java.util.ArrayList;

public class ActivitySelection {

     public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9}; //end-time basis already sorted so,no need to apply sorting algorithms


        //sorting
        int activites[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
         activites[i][0] = i;
         activites[i][1] = start[i];
         activites[i][2] = end[i];
        }

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();


      //   //add 1st activity by deafault //tc:O(n)
      //   ans.add(0);
      //   maxAct = 1;
      //   int lastEnd = end[0];

      //   //add non overlapping activites
      //   for(int i =1;i<end.length;i++){
      //    if (start[i] >= lastEnd) {
      //       ans.add(i); //add the index
      //       maxAct++;
      //       lastEnd = end[i];
      //    }
      //   }


        ans.add(activites[0][0]); //tc:O(nlogn)
        maxAct = 1;
        int lastEnd = activites[0][2];

        //add non overlapping activites
        for(int i =1;i<end.length;i++){
         if (activites[i][1] >= lastEnd) {
            ans.add(activites[i][0]); //add the index
            maxAct++;
            lastEnd =activites[i][2];
         }
        }

        System.out.println("Maximum Activities: " + maxAct);
        System.out.print("Selected Activities: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("a" + ans.get(i) + " ");
        }
     }

}