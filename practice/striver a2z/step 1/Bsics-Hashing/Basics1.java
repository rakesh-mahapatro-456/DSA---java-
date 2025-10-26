import java.util.HashMap;

public class Basics1{

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,2,2};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:arr){
           hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i:hm.keySet()){
            System.out.println(i+"->"+hm.get(i));
        }

        int firstKey = hm.keySet().iterator().next();
        int max = firstKey;
        int min = firstKey;


        for(int i:hm.keySet()){
            if(hm.get(i) > hm.get(max)){
                max = i;
            }

            if(hm.get(i) < hm.get(min)){
                min = i;
            }
        }

        System.out.println("max:"+max);
        System.out.println("min:"+min);
       
    }
}