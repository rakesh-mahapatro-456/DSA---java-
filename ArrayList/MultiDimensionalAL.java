import java.util.ArrayList;

public class MultiDimensionalAL {
    public static void main(String[] args) {
        // a 2d array list is a array list of array list
        ArrayList<ArrayList<Integer>> main = new ArrayList<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        main.add(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        main.add(list1);

        for(int i=0;i<main.size();i++){
            ArrayList<Integer> currList = main.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+"");
            }
            System.out.println();
        }

        // or

        System.out.println(main);
    }
}
