import java.util.ArrayList;

public class HeapsB {
    static class  Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //s1:add to last of the al
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;
            
            //s2:check par and child
            while (arr.get(x)<arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public int remove(){
            int data = arr.get(0);
            //s1:swap last and first elements
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //s2:delete last
            arr.remove(arr.size()-1);

            //s3:heapify
            heapify(0);

            return data;
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if (left <arr.size() && arr.get(minIdx)>arr.get(left)) {
                minIdx = left;
            }

            if (right <arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
            
        }


        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(5);
        hp.add(1);
        hp.add(3);
        hp.add(0);

        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }
    
}
