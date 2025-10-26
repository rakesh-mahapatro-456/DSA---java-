import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int solider;
        int idx;

        public Row(int solider,int idx){
            this.solider = solider;
            this.idx = idx;
        }


        @Override
        public int compareTo(Row s2){
            if(this.solider == s2.solider){
                return this.idx - s2.idx;
            }
            else{
                return this.solider - s2.solider;
            }
        }
    }



    public static void main(String[] args) {
        
        int army [][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        int k=2;
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int count = 0;
            for(int j=0;j<army[0].length;j++){
                count+= army[i][j] == 1 ? 1:0;
            }

            pq.add(new Row(count, i));
        }


        for(int i=0;i<k;i++){
            System.out.println("R" + pq.remove().idx);
        }
    }
}
