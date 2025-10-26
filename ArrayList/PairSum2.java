import java.util.ArrayList;

public class PairSum2 {
    // Find if any pair in a Sorted & Rotated ArrayList has a target sum.
    // list = [11, 15, 6, 8, 9, 10], target=16

    public static boolean pairSum(ArrayList<Integer> list,int target){
        // Brute force - O(n^2)
        for(int i =0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if (list.get(i)+list.get(j)== target) {
                    return true;
                }
            }
        }

        // 2-pointer approach - O(n)
        // 1. find out pivot point i.e breaking point from where sorted arrays are broken
        // in a sorted list or array always arr[i] < arr[i+1]
        // [11,15,6,8,9,10] --> list[1] is not small than list[2] hence, its the pivot point i.e indice:1
        // 2. now we initialize lp as i+1 (let,i is the pivot) and rp as i . now similar to 2 pointer apparoach now we do lp++ as right side elements are small and rp-- as left side elemnets are smaller . if it lp or rp exhausts the lrst or right side rescpectively then it should rotate and go towards end or start respectively of the array list
        // 3. while loop with condition lp<rp or lp!=rp

        // in order to perform rotation we use modular arithemetic(%) i.e an advanced branch of math. so, in order for updation f lp and rp  so that its rotates around the array list we use modular property i.e 
        // lp = (lp+1)%n  (n=arr.size())
        // rp = (n+rp-1)%n 
        // we use modulo rules when we want to increase our iterator or pointer values in out of boundary of size n array or array list i.e we want to rotate our iterators or pointer in the range of n
        // modulo with any number will always lie inside the range of 0 to n-1
        // x%n == o to n-1

        int pivot = 0;
        for(int i=0;i<list.size();i++){
            if (list.get(i)>list.get(i+1)) { //breaking point 
                pivot = i;
                break; // break loop there
            }
        }

        int lp = pivot+1;
        int rp = pivot;
        int n = list.size()-1;

        while (lp<rp) { // or while(lp!=rp)
            //case 1
            if (list.get(lp)+list.get(rp) == target) {
                return true;
            }
            // case 2 
            else if (list.get(lp)+list.get(rp) < target) {
                lp = (lp+1)%n ;
            }
            // case 3
            else{
                rp = (n+rp-1)%n ;
            }
        }


        
       return false;
    }



      public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add (11); 
        list. add (15); 
        list.add (6); 
        list.add (8);
        list.add (9); 
        list.add (10);
        int target = 16;

        System.out.println(pairSum(list, target));
    }
}
